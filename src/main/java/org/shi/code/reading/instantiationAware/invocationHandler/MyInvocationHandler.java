package org.shi.code.reading.instantiationAware.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author sliang
 * @Date 12/21-021
 **/
public class MyInvocationHandler implements InvocationHandler {
    private Object bean;

    public MyInvocationHandler(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了方法");
        return method.invoke(bean, args);
    }
}
