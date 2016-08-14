package com.feijiu.framework.proxy;

import com.feijiu.framework.proxy.client.ClientProxyTest;
import com.feijiu.framework.proxy.interceptor.AbstracInterfacetInterceptorHandler;
import com.feijiu.framework.proxy.interceptor.AbstractInterceptorHandler;
import com.feijiu.framework.proxy.interceptor.Interceptor;
import com.feijiu.framework.proxy.server.IServerProxyTest;
import com.feijiu.framework.proxy.server.ServerProxyTest;

import static com.feijiu.framework.proxy.client.ClientProxyTest.*;

/**
 * Created by zhangtao on 2016/8/11.
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        IServerProxyTest proxyTest = new ProxyFactory(ServerProxyTest.class,AbstractInterceptorHandler.class).instance();
        System.out.println(proxyTest.say("你"));

        ClientProxyTest test = new ProxyFactory(ClientProxyTest.class,AbstracInterfacetInterceptorHandler.class).instance();
        System.out.println(test.say("大"));
    }

}
