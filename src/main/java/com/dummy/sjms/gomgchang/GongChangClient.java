package com.dummy.sjms.gomgchang;

/**
 * @Version 1.0
 * @ClassName GongChangClient
 * @Author duanshouzhi
 * @Date 2025/3/18 15:25
 * @Description TODO
 **/
public class GongChangClient {


    private final GongChangFactory gongChangFactory;

    public GongChangClient(GongChangFactory gongChangFactory) {
         this.gongChangFactory = gongChangFactory;
    }

    public void gongChang() {
        gongChangFactory.create();
    }


}
