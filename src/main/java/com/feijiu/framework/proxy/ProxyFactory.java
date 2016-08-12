package com.feijiu.framework.proxy;


import com.feijiu.framework.proxy.interceptor.Interceptor;

/**
 * Created by zhangtao on 2016/8/12.
 */
public class ProxyFactory {

    private Class<? extends Proxy> proxy ;
    private Class<? extends Interceptor> interceptor ;

    public ProxyFactory(Class<? extends Proxy> proxy,Class<? extends Interceptor> interceptor){
        this.interceptor = interceptor ;
        this.proxy = proxy ;
    }


    public <T> T instance() throws Exception {
        if(proxy.isInterface()){
            InterfaceProxyHandler<T> handler = new InterfaceProxyHandler<T>();
            return handler.getInstance(interceptor);
        }else{

            return (T) proxy.newInstance().getInstance(interceptor);
        }

    }
}
