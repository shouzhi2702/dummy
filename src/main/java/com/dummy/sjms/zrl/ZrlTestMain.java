package com.dummy.sjms.zrl;

/**
 * @Version 1.0
 * @ClassName ZrlTestMain
 * @Author duanshouzhi
 * @Date 2025/3/17 20:12
 * @Description TODO
 **/
public class ZrlTestMain {

    public static void main(String[] args) {
        new ZrlA().setAbstractZrl(new ZrlC().setAbstractZrl(new ZrlB())).apply();
    }

}
