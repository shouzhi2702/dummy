package com.dummy.sjms.celue;

/**
 * @Version 1.0
 * @ClassName ZfbCelue
 * @Author duanshouzhi
 * @Date 2025/3/18 10:08
 * @Description TODO
 **/
public class WxCelue implements CelueService{
    @Override
    public void celue() {
        System.out.println("使用微信支付");
    }
}
