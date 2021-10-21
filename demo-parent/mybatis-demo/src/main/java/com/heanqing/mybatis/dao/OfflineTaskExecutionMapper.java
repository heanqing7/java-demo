package com.heanqing.mybatis.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface OfflineTaskExecutionMapper {
    public static final String COLUMNS="id, task_id, sequence,batch_no, last_operator, start_time, end_time, status, resource_status,result,add_time, update_time, extra";


    //经典用法-插入记录之后返回刚才插入的主键id，注意，statement和provider中的sql，是在一个事务中执行的，不存在并发问题
    @InsertProvider(type=OfflineTaskExecutionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(OfflineTaskExecution record);


    //经典用法-使用脚本生成批量插入语句
    @Insert({
        "<script>",
        "insert into horus_v2_offline_task_execution (task_id, sequence, ",
        "batch_no, last_operator, ",
        "start_time, end_time, ",
        "status, resource_status, ",
        "result, add_time, ",
        "update_time, extra)",
        "values",
        "<foreach collection='list' item='item' index='index' separator=','>",
        " (#{item.taskId,jdbcType=INTEGER}, #{item.sequence,jdbcType=INTEGER}, ",
        "#{item.batchNo,jdbcType=VARCHAR}, #{item.lastOperator,jdbcType=VARCHAR}, ",
        "#{item.startTime,jdbcType=TIMESTAMP}, #{item.endTime,jdbcType=TIMESTAMP}, ",
        "#{item.status,jdbcType=INTEGER}, #{item.resourceStatus,jdbcType=INTEGER}, ",
        "#{item.result,jdbcType=INTEGER}, #{item.addTime,jdbcType=TIMESTAMP}, ",
        "#{item.updateTime,jdbcType=TIMESTAMP}, #{item.extra,jdbcType=LONGVARCHAR})",
        "</foreach>",
        "</script>",
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int batchInsert(@Param("list") List<OfflineTaskExecution> list);


    //经典用法-查询+手动字段映射
    @SelectProvider(type=OfflineTaskExecutionSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="task_id", property="taskId", jdbcType=JdbcType.INTEGER),
        @Result(column="sequence", property="sequence", jdbcType=JdbcType.INTEGER),
        @Result(column="batch_no", property="batchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_operator", property="lastOperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="resource_status", property="resourceStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="result", property="result", jdbcType=JdbcType.INTEGER),
        @Result(column="add_time", property="addTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<OfflineTaskExecution> selectByExampleWithBLOBs(OfflineTaskExecutionExample example);


    @SelectProvider(type=OfflineTaskExecutionSqlProvider.class, method="countByExample")
    long countByExample(OfflineTaskExecutionExample example);

    @DeleteProvider(type=OfflineTaskExecutionSqlProvider.class, method="deleteByExample")
    int deleteByExample(OfflineTaskExecutionExample example);

    @Delete({
        "delete from horus_v2_offline_task_execution",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);


    //更新操作
    @UpdateProvider(type=OfflineTaskExecutionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OfflineTaskExecution record, @Param("example") OfflineTaskExecutionExample example);


    //批量更新操作

}