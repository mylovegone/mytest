package com.example.demo.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyStudyProxy implements InvocationHandler {

    private Study study;

    public MyStudyProxy(Study study) {
        this.study = study;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我热爱学习！！");
         method.invoke(study,args);
         System.out.println("今天学习状态很好！！");
         return null;
    }
}
