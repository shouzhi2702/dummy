package com.dummy.sjms.celue;

/**
 * @Version 1.0
 * @ClassName ZfbCelue
 * @Author duanshouzhi
 * @Date 2025/3/18 10:08
 * @Description TODO
 **/
public class ZfbCelue implements CelueService{
    @Override
    public void celue() {
        System.out.println("使用支付宝支付");
    }
}
