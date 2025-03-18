package com.dummy.sjms.celue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @Version 1.0
 * @ClassName CelueHandler
 * @Author duanshouzhi
 * @Date 2025/3/18 10:00
 * @Description TODO
 **/
public class CelueHandler {

       private final static Map<String, CelueService> handler = new ConcurrentHashMap<>();


       public void celue(HandlerEnum type) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
           String name = type.name();
           CelueService celueService = handler.get(name);
           if(celueService == null){
               Class<CelueService> celueServiceClass = CelueService.class;
               String packageName = celueServiceClass.getPackageName();
               System.out.println("包名：" + packageName);
               //String className = (packageName + "." + name).replace(".", "/");
               //System.out.println("className：" + className);
               //String classpath = celueServiceClass.getResource("/").getPath();
               //System.out.println("classpath：" + classpath);

               Class<?> aClass = Class.forName(packageName + "." + name);
               Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
               celueService = (CelueService) declaredConstructor.newInstance();

               handler.put(name, celueService);
           }

           // 执行支付
           celueService.celue();
       }




}

