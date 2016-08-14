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

}
