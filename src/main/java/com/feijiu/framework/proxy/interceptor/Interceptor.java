package com.feijiu.framework.proxy.interceptor;


/**
 * Created by zhangtao on 2016/8/11.
 */
public interface Interceptor<T> {

    static <T> T instance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
//        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz.newInstance();
    }

}
