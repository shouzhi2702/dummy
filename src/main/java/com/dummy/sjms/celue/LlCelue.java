package com.dummy.sjms.celue;

/**
 * @Version 1.0
 * @ClassName ZfbCelue
 * @Author duanshouzhi
 * @Date 2025/3/18 10:08
 * @Description TODO
 **/
public class LlCelue implements CelueService{
    @Override
    public void celue() {
        System.out.println("使用连连支付");
    }
}
