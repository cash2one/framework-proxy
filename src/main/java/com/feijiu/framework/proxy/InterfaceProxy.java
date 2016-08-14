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

}
