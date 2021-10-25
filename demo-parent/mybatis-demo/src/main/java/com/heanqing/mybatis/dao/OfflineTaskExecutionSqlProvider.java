package com.heanqing.mybatis.dao;

import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class OfflineTaskExecutionSqlProvider {
//    public String countByExample(OfflineTaskExecutionExample example) {
//        SQL sql = new SQL();
//        sql.SELECT("count(*)").FROM("v2_offline_task_execution");
//        applyWhere(sql, example, false);
//        return sql.toString();
//    }
//
//    public String deleteByExample(OfflineTaskExecutionExample example) {
//        SQL sql = new SQL();
//        sql.DELETE_FROM("v2_offline_task_execution");
//        applyWhere(sql, example, false);
//        return sql.toString();
//    }
//
//    public String insertSelective(OfflineTaskExecution record) {
//        SQL sql = new SQL();
//        sql.INSERT_INTO("v2_offline_task_execution");
//
//        if (record.getTaskId() != null) {
//            sql.VALUES("task_id", "#{taskId,jdbcType=INTEGER}");
//        }
//
//        if (record.getSequence() != null) {
//            sql.VALUES("sequence", "#{sequence,jdbcType=INTEGER}");
//        }
//
//        if (record.getBatchNo() != null) {
//            sql.VALUES("batch_no", "#{batchNo,jdbcType=VARCHAR}");
//        }
//
//        if (record.getLastOperator() != null) {
//            sql.VALUES("last_operator", "#{lastOperator,jdbcType=VARCHAR}");
//        }
//
//        if (record.getStartTime() != null) {
//            sql.VALUES("start_time", "#{startTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getEndTime() != null) {
//            sql.VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getStatus() != null) {
//            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
//        }
//
//        if (record.getResourceStatus() != null) {
//            sql.VALUES("resource_status", "#{resourceStatus,jdbcType=INTEGER}");
//        }
//
//        if (record.getResult() != null) {
//            sql.VALUES("result", "#{result,jdbcType=INTEGER}");
//        }
//
//        if (record.getAddTime() != null) {
//            sql.VALUES("add_time", "#{addTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getUpdateTime() != null) {
//            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getExtra() != null) {
//            sql.VALUES("extra", "#{extra,jdbcType=LONGVARCHAR}");
//        }
//
//        return sql.toString();
//    }
//
//    public String selectByExampleWithBLOBs(OfflineTaskExecutionExample example) {
//        SQL sql = new SQL();
//        if (example != null && example.isDistinct()) {
//            sql.SELECT_DISTINCT("id");
//        } else {
//            sql.SELECT("id");
//        }
//        sql.SELECT("task_id");
//        sql.SELECT("sequence");
//        sql.SELECT("batch_no");
//        sql.SELECT("last_operator");
//        sql.SELECT("start_time");
//        sql.SELECT("end_time");
//        sql.SELECT("status");
//        sql.SELECT("resource_status");
//        sql.SELECT("result");
//        sql.SELECT("add_time");
//        sql.SELECT("update_time");
//        sql.SELECT("extra");
//        sql.FROM("v2_offline_task_execution");
//        applyWhere(sql, example, false);
//
//        if (example != null && example.getOrderByClause() != null) {
//            sql.ORDER_BY(example.getOrderByClause());
//        }
//
//        return sql.toString();
//    }
//
//    public String selectByExample(OfflineTaskExecutionExample example) {
//        SQL sql = new SQL();
//        if (example != null && example.isDistinct()) {
//            sql.SELECT_DISTINCT("id");
//        } else {
//            sql.SELECT("id");
//        }
//        sql.SELECT("task_id");
//        sql.SELECT("sequence");
//        sql.SELECT("batch_no");
//        sql.SELECT("last_operator");
//        sql.SELECT("start_time");
//        sql.SELECT("end_time");
//        sql.SELECT("status");
//        sql.SELECT("resource_status");
//        sql.SELECT("result");
//        sql.SELECT("add_time");
//        sql.SELECT("update_time");
//        sql.FROM("v2_offline_task_execution");
//        applyWhere(sql, example, false);
//
//        if (example != null && example.getOrderByClause() != null) {
//            sql.ORDER_BY(example.getOrderByClause());
//        }
//
//        return sql.toString();
//    }
//
//    public String updateByExampleSelective(Map<String, Object> parameter) {
//        OfflineTaskExecution record = (OfflineTaskExecution) parameter.get("record");
//        OfflineTaskExecutionExample example = (OfflineTaskExecutionExample) parameter.get("example");
//
//        SQL sql = new SQL();
//        sql.UPDATE("v2_offline_task_execution");
//
//        if (record.getId() != null) {
//            sql.SET("id = #{record.id,jdbcType=INTEGER}");
//        }
//
//        if (record.getTaskId() != null) {
//            sql.SET("task_id = #{record.taskId,jdbcType=INTEGER}");
//        }
//
//        if (record.getSequence() != null) {
//            sql.SET("sequence = #{record.sequence,jdbcType=INTEGER}");
//        }
//
//        if (record.getBatchNo() != null) {
//            sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
//        }
//
//        if (record.getLastOperator() != null) {
//            sql.SET("last_operator = #{record.lastOperator,jdbcType=VARCHAR}");
//        }
//
//        if (record.getStartTime() != null) {
//            sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getEndTime() != null) {
//            sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getStatus() != null) {
//            sql.SET("status = #{record.status,jdbcType=INTEGER}");
//        }
//
//        if (record.getResourceStatus() != null) {
//            sql.SET("resource_status = #{record.resourceStatus,jdbcType=INTEGER}");
//        }
//
//        if (record.getResult() != null) {
//            sql.SET("result = #{record.result,jdbcType=INTEGER}");
//        }
//
//        if (record.getAddTime() != null) {
//            sql.SET("add_time = #{record.addTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getUpdateTime() != null) {
//            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getExtra() != null) {
//            sql.SET("extra = #{record.extra,jdbcType=LONGVARCHAR}");
//        }
//
//        applyWhere(sql, example, true);
//        return sql.toString();
//    }
//
//    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
//        SQL sql = new SQL();
//        sql.UPDATE("v2_offline_task_execution");
//
//        sql.SET("id = #{record.id,jdbcType=INTEGER}");
//        sql.SET("task_id = #{record.taskId,jdbcType=INTEGER}");
//        sql.SET("sequence = #{record.sequence,jdbcType=INTEGER}");
//        sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
//        sql.SET("last_operator = #{record.lastOperator,jdbcType=VARCHAR}");
//        sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
//        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
//        sql.SET("status = #{record.status,jdbcType=INTEGER}");
//        sql.SET("resource_status = #{record.resourceStatus,jdbcType=INTEGER}");
//        sql.SET("result = #{record.result,jdbcType=INTEGER}");
//        sql.SET("add_time = #{record.addTime,jdbcType=TIMESTAMP}");
//        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
//        sql.SET("extra = #{record.extra,jdbcType=LONGVARCHAR}");
//
//        OfflineTaskExecutionExample example = (OfflineTaskExecutionExample) parameter.get("example");
//        applyWhere(sql, example, true);
//        return sql.toString();
//    }
//
//    public String updateByExample(Map<String, Object> parameter) {
//        SQL sql = new SQL();
//        sql.UPDATE("v2_offline_task_execution");
//
//        sql.SET("id = #{record.id,jdbcType=INTEGER}");
//        sql.SET("task_id = #{record.taskId,jdbcType=INTEGER}");
//        sql.SET("sequence = #{record.sequence,jdbcType=INTEGER}");
//        sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
//        sql.SET("last_operator = #{record.lastOperator,jdbcType=VARCHAR}");
//        sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
//        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
//        sql.SET("status = #{record.status,jdbcType=INTEGER}");
//        sql.SET("resource_status = #{record.resourceStatus,jdbcType=INTEGER}");
//        sql.SET("result = #{record.result,jdbcType=INTEGER}");
//        sql.SET("add_time = #{record.addTime,jdbcType=TIMESTAMP}");
//        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
//
//        OfflineTaskExecutionExample example = (OfflineTaskExecutionExample) parameter.get("example");
//        applyWhere(sql, example, true);
//        return sql.toString();
//    }
//
//    public String updateByPrimaryKeySelective(OfflineTaskExecution record) {
//        SQL sql = new SQL();
//        sql.UPDATE("v2_offline_task_execution");
//
//        if (record.getTaskId() != null) {
//            sql.SET("task_id = #{taskId,jdbcType=INTEGER}");
//        }
//
//        if (record.getSequence() != null) {
//            sql.SET("sequence = #{sequence,jdbcType=INTEGER}");
//        }
//
//        if (record.getBatchNo() != null) {
//            sql.SET("batch_no = #{batchNo,jdbcType=VARCHAR}");
//        }
//
//        if (record.getLastOperator() != null) {
//            sql.SET("last_operator = #{lastOperator,jdbcType=VARCHAR}");
//        }
//
//        if (record.getStartTime() != null) {
//            sql.SET("start_time = #{startTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getEndTime() != null) {
//            sql.SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getStatus() != null) {
//            sql.SET("status = #{status,jdbcType=INTEGER}");
//        }
//
//        if (record.getResourceStatus() != null) {
//            sql.SET("resource_status = #{resourceStatus,jdbcType=INTEGER}");
//        }
//
//        if (record.getResult() != null) {
//            sql.SET("result = #{result,jdbcType=INTEGER}");
//        }
//
//        if (record.getAddTime() != null) {
//            sql.SET("add_time = #{addTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getUpdateTime() != null) {
//            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
//        }
//
//        if (record.getExtra() != null) {
//            sql.SET("extra = #{extra,jdbcType=LONGVARCHAR}");
//        }
//
//        sql.WHERE("id = #{id,jdbcType=INTEGER}");
//
//        return sql.toString();
//    }
//
//    protected void applyWhere(SQL sql, OfflineTaskExecutionExample example, boolean includeExamplePhrase) {
//        if (example == null) {
//            return;
//        }
//
//        String parmPhrase1;
//        String parmPhrase1_th;
//        String parmPhrase2;
//        String parmPhrase2_th;
//        String parmPhrase3;
//        String parmPhrase3_th;
//        if (includeExamplePhrase) {
//            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
//            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
//            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
//            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
//            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
//            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
//        } else {
//            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
//            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
//            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
//            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
//            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
//            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
//        }
//
//        StringBuilder sb = new StringBuilder();
//        List<Criteria> oredCriteria = example.getOredCriteria();
//        boolean firstCriteria = true;
//        for (int i = 0; i < oredCriteria.size(); i++) {
//            Criteria criteria = oredCriteria.get(i);
//            if (criteria.isValid()) {
//                if (firstCriteria) {
//                    firstCriteria = false;
//                } else {
//                    sb.append(" or ");
//                }
//
//                sb.append('(');
//                List<Criterion> criterions = criteria.getAllCriteria();
//                boolean firstCriterion = true;
//                for (int j = 0; j < criterions.size(); j++) {
//                    Criterion criterion = criterions.get(j);
//                    if (firstCriterion) {
//                        firstCriterion = false;
//                    } else {
//                        sb.append(" and ");
//                    }
//
//                    if (criterion.isNoValue()) {
//                        sb.append(criterion.getCondition());
//                    } else if (criterion.isSingleValue()) {
//                        if (criterion.getTypeHandler() == null) {
//                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
//                        } else {
//                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
//                        }
//                    } else if (criterion.isBetweenValue()) {
//                        if (criterion.getTypeHandler() == null) {
//                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
//                        } else {
//                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
//                        }
//                    } else if (criterion.isListValue()) {
//                        sb.append(criterion.getCondition());
//                        sb.append(" (");
//                        List<?> listItems = (List<?>) criterion.getValue();
//                        boolean comma = false;
//                        for (int k = 0; k < listItems.size(); k++) {
//                            if (comma) {
//                                sb.append(", ");
//                            } else {
//                                comma = true;
//                            }
//                            if (criterion.getTypeHandler() == null) {
//                                sb.append(String.format(parmPhrase3, i, j, k));
//                            } else {
//                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
//                            }
//                        }
//                        sb.append(')');
//                    }
//                }
//                sb.append(')');
//            }
//        }
//
//        if (sb.length() > 0) {
//            sql.WHERE(sb.toString());
//        }
//    }
}