package com.example.demo.aop;

import net.sf.cglib.proxy.Enhancer;

public class Test {


    public static void main(String[] args) {
        //代理类class文件存入本地磁盘
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(PersonService.class);
//        enhancer.setCallback(new CglibProxyIntercepter());
//        PersonService proxy= (PersonService)  enhancer.create();
//        proxy.setPerson();
        CglibInterceptor proxy = new CglibInterceptor();
        Cglib cglib = (Cglib) proxy.getProxy(Cglib.class);
        cglib.say();
    }
}
