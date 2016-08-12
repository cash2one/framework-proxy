package com.feijiu.framework.proxy;


import com.feijiu.framework.proxy.interceptor.Interceptor;
import com.feijiu.framework.proxy.interceptor.InterceptorFactory;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by zhangtao on 2016/8/11.
 * 接口代理创建
 */
public interface InterfaceProxy<T> extends Proxy<T>{

//    @Override
//    default Class<T> getInstanceClass() throws Exception{
//        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        return tClass;
//    }
//
//    @Override
//    default T getInstance(Class<? extends Interceptor> interceptor) throws Exception{
//        Class<T> clazz = getInstanceClass();
//        ByteCodeUtil byteCode = new ByteCodeUtil();
//        byteCode.setSourceInterFace(clazz);
//        clazz=byteCode.createClass();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(clazz);
//        enhancer.setCallback(InterceptorFactory.instance(interceptor));
//        return (T) enhancer.create();
//    }

}
