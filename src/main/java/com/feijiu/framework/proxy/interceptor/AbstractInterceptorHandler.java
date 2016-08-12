package com.feijiu.framework.proxy.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangtao on 2016/8/11.
 * 代理类执行方法
 */
public class AbstractInterceptorHandler implements MethodInterceptor , Interceptor<AbstractInterceptorHandler>  {


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        return null ;
    }
}
