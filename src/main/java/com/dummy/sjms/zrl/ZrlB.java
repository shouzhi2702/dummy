package com.dummy.sjms.zrl;

/**
 * @Version 1.0
 * @ClassName ZrlA
 * @Author duanshouzhi
 * @Date 2025/3/17 20:06
 * @Description TODO
 **/
public class ZrlB extends AbstractZrl{

    private static String name = "B";

    @Override
    void apply() {
        System.out.println("先做自己"+name+"的事情");
        if(getAbstractZrl() != null){
             System.out.println("开始处理下一个任务");
             getAbstractZrl().apply();
        }
    }
}
