package com.dummy.lmd;

import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Version 1.0
 * @ClassName ForTestMain
 * @Author duanshouzhi
 * @Date 2025/3/20 22:42
 * @Description TODO
 **/
public class ForTestMain {
    public static void main(String[] args) {
        // 创建一个可修改的 ArrayList
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        for (String o : list) {
            o = "6";
        }

        System.out.println(JSON.toJSONString(list));
    }
}
