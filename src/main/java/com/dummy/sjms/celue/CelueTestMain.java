package com.dummy.sjms.celue;

import java.lang.reflect.InvocationTargetException;

/**
 * @Version 1.0
 * @ClassName CelueTestMain
 * @Author duanshouzhi
 * @Date 2025/3/18 10:38
 * @Description TODO
 **/
public class CelueTestMain {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String[] paths = //获取所有classpath路径
                System.getProperty("java.class.path")
                        .split(System.getProperty("path.separator"));

        CelueHandler celueHandler = new CelueHandler();
        celueHandler.celue(HandlerEnum.LlCelue);
    }

}