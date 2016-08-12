package com.feijiu.framework.proxy;



import com.feijiu.framework.proxy.interceptor.Interceptor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * Created by zhangtao on 2016/8/10.
 * 动态代理接口
 */
public interface Proxy<T> {


    /**
     * 获取代理对象类型
     * @return
     * @throws Exception
     */
    Class<T> getInstanceClass() throws Exception ;

    /**
     * 获取代理对象实例
     * @return
     * @throws Exception
     */
    T getInstance(Interceptor<?> interceptor) throws Exception ;

//    /**
//     * 执行代理方法
//     * @return
//     * @throws Exception
//     */
//    Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Exception;

}
