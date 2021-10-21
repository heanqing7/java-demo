package com.heanqing.param_check;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

public class GuavaParamCheckUtil {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>();
        //五种使用方式-检查空
        Preconditions.checkNotNull(list);

        //五种使用方式-表达式的方式检查参数
        Preconditions.checkArgument(!list.isEmpty());

        //五种使用方式-检查状态，检查的不应该是参数
        Preconditions.checkState(list.size() == 1);

        //五种使用方式-检查index是否越界
        int index = 1;
        Preconditions.checkElementIndex(index, list.size());

        //五种使用方式-检查区间是否越界
        int start = 1;
        int end = 3;
        Preconditions.checkPositionIndexes(start, end, list.size());

        //两种提示模式
        Preconditions.checkArgument(!list.isEmpty(), "list不应为空");
        Preconditions.checkArgument(!list.isEmpty(), "list不应为空，当前list:%s",list.size());

    }

}
