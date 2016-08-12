package com.feijiu.framework.proxy.server;

import com.feijiu.framework.proxy.ClassProxy;

/**
 * Created by zhangtao on 2016/8/12.
 */
public  class ServerProxyTest extends ClassProxy<IServerProxyTest> implements IServerProxyTest {

    @Override
    public String say(String str) {
        System.out.println("METHOD");
        return ""+str;
    }

//    @Override
//    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Exception {
//        System.out.println("大");
//        return null;
//    }
}
