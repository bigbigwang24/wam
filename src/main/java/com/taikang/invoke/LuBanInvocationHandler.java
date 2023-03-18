package com.taikang.invoke;

import com.taikang.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangam
 * @ClassName LuBaninvocationhandller
 * @Description:TODO
 * @date 2021/7/5
 */
public class LuBanInvocationHandler implements InvocationHandler {

    Object target;

    public LuBanInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invocation handler!!!!!!!!!!!!!");
        return method.invoke(target, args);
    }
}
