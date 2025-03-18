package com.dummy.sjms.gomgchang;

/**
 * @Version 1.0
 * @ClassName GChang1
 * @Author duanshouzhi
 * @Date 2025/3/18 15:29
 * @Description TODO
 **/
public class GChang1 implements GongChangFactory{
    @Override
    public void create() {
        System.out.println( "我是GChang1");
    }
}
