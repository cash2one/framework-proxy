package com.feijiu.framework.proxy.interceptor;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 涛 on 2016/8/14.
 * 客户端方法代理执行
 */
public class AbstracInterfacetInterceptorHandler implements Interceptor {


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("12313213");
        return null ;
    }
}
