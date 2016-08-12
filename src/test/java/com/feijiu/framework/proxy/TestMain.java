package com.feijiu.framework.proxy;

import com.feijiu.framework.proxy.interceptor.AbstractInterceptorHandler;
import com.feijiu.framework.proxy.interceptor.Interceptor;
import com.feijiu.framework.proxy.server.IServerProxyTest;
import com.feijiu.framework.proxy.server.ServerProxyTest;

/**
 * Created by zhangtao on 2016/8/11.
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        Interceptor<AbstractInterceptorHandler> handler = Interceptor.instance(AbstractInterceptorHandler.class);
        System.out.println();
//        ProxyFactory factory  = new ProxyFactory(new ServerProxyTest(),new AbstractInterceptorHandler());
//        IServerProxyTest test = (IServerProxyTest) factory.instance();
//        System.out.println(test.say("你"));
//        System.out.println(test.say("你"));
//        ClientProxyTest test = (ClientProxyTest) new ClientProxyTest.instance();
//        test.say("aaaa");
//        ProxyFactory factory  = new ProxyFactory(ClientProxyTest.,new AbstractInterceptorHandler());
//        ClientProxyTest test = (ClientProxyTest) factory.instance();
//        test.say("你");
    }

}
