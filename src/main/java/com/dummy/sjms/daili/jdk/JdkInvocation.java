package com.dummy.sjms.daili.jdk;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Version 1.0
 * @ClassName JdkInvocation
 * @Author duanshouzhi
 * @Date 2025/3/18 15:32
 * @Description TODO
 **/

@AllArgsConstructor
public class JdkInvocation implements InvocationHandler {

    private JdkInterface jdkInterface;

    /**
     * @Author duanshouzhi
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        method.invoke(jdkInterface,args);

        after();

        return null;
    }


    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }

}
