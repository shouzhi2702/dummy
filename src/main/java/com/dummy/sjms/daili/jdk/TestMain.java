package com.dummy.sjms.daili.jdk;

import java.lang.reflect.Proxy;

/**
 * @Version 1.0
 * @ClassName TestMain
 * @Author duanshouzhi
 * @Date 2025/3/18 15:34
 * @Description TODO
 **/
public class TestMain {

    public static void main(String[] args) {


        JdkInterfaceImpl jdkInterfaceImpl = new JdkInterfaceImpl();

        JdkInterface jdkProxy = (JdkInterface) Proxy.newProxyInstance(
                jdkInterfaceImpl.getClass().getClassLoader(),
                jdkInterfaceImpl.getClass().getInterfaces(),
                new JdkInvocation(jdkInterfaceImpl)
        );

        jdkProxy.jdkInterface();

        String name = "666666";
        String name3 = "999999";
        String name2 = "888888";
    }


}
