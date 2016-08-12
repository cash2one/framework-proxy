package com.feijiu.framework.proxy.server;

import com.feijiu.framework.proxy.AbstractProxy;
import com.feijiu.framework.proxy.CGLibProxy;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangtao on 2016/8/12.
 */
public  class ServerProxyTest extends CGLibProxy<IServerProxyTest> implements IServerProxyTest {

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
