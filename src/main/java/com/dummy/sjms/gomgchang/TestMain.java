package com.dummy.sjms.gomgchang;

/**
 * @Version 1.0
 * @ClassName TestMain
 * @Author duanshouzhi
 * @Date 2025/3/18 15:26
 * @Description TODO
 **/
public class TestMain {

    public static void main(String[] args) {
        GongChangClient gChang1 = new GongChangClient(new GChang1());
        gChang1.gongChang();

        GongChangClient gChang2 = new GongChangClient(new GChang2());
        gChang2.gongChang();
    }

}
