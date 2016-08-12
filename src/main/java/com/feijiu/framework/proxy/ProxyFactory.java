package com.feijiu.framework.proxy;

import com.feijiu.framework.proxy.interceptor.Interceptor;

/**
 * Created by zhangtao on 2016/8/12.
 */
public class ProxyFactory {

    private Proxy<?> proxy ;//代理类生成方法
    private Interceptor<?> interceptor ;//代理执行方法

    public ProxyFactory(Proxy<?> proxy , Interceptor<?> interceptor){
        this.proxy = proxy ;
        this.interceptor = interceptor ;
    }


    public Object instance() throws Exception {
        return proxy.getInstance(interceptor);
    }

}
