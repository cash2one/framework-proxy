package com.feijiu.framework.proxy.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangtao on 2016/8/11.
 * 代理类执行方法
 */
public class AbstractInterceptorHandler implements Interceptor {


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if(obj.getClass().isInterface()){
            System.out.println("12313213");
        }else{
            System.out.println("asdasdsadad");
        }
        return null ;
    }
}
