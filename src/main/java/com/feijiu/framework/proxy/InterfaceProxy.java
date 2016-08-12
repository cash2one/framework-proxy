package com.feijiu.framework.proxy;


import com.feijiu.framework.proxy.interceptor.Interceptor;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.ParameterizedType;

/**
 * Created by zhangtao on 2016/8/11.
 * 接口代理创建
 */
public interface InterfaceProxy<T> extends Proxy<T>{


//    static Class<T> getInstanceClass(){
//        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        return tClass;
//    }
//
//    static  <T> T getInstance(Interceptor<?> interceptor) throws Exception {
//        Class<T> clazz = getInstanceClass();
//        ByteCodeUtil byteCode = new ByteCodeUtil();
//        byteCode.setSourceInterFace(clazz);
//        clazz=byteCode.createClass();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(clazz);
//        enhancer.setCallback(interceptor.getIntercept());
//        return (T) enhancer.create();
//    }
}
