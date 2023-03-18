package com.taikang.test;

import com.taikang.dao.UserDao;
import com.taikang.impl.UserDaoImpl;
import com.taikang.invoke.LuBanInvocationHandler;
import com.taikang.proxy.ProxyUtil;

import java.lang.reflect.Proxy;

/**
 * @author wangam
 * @ClassName Test
 * @Description:TODO
 * @date 2021/7/3
 */
public class Test {

    public static void main(String[] args) {
        UserDao instance = (UserDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{UserDao.class}, new LuBanInvocationHandler(new UserDaoImpl()));

        instance.query();
    }
}
