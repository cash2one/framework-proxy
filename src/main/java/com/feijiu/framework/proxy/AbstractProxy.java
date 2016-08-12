package com.feijiu.framework.proxy;


import com.feijiu.framework.proxy.interceptor.Interceptor;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.ParameterizedType;

/**
 * Created by zhangtao on 2016/8/10.
 * 接口实现类代理实现
 */
public abstract class AbstractProxy<T>  implements Proxy<T>{


//    @Override
//    public Class<T> getInstanceClass(){
//        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        return tClass;
//    }
//
//    @Override
//    public T getInstance(Interceptor<?> interceptor) throws Exception {
//        Class<T> clazz = getInstanceClass();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(clazz);
//        enhancer.setCallback(interceptor.getIntercept());
//        return (T) enhancer.create();
//    }

}
