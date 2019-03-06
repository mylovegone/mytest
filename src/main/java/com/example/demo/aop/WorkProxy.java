package com.example.demo.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Method;

public class WorkProxy implements MethodInterceptor {
    Enhancer enhancer = new Enhancer();

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
         System.out.println("工作之前，请吃饱饭，这样才有力气！");
         methodProxy.invokeSuper(o,objects);
         System.out.println("学习完成！！");
         return null;

    }

   public  Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new WorkProxy());
        return  enhancer.create();
   }

   public static void main(String[] args){
//        WorkProxy workProxy = new WorkProxy();
//        Work work = (Work) workProxy.getProxy(Work.class);
//        int a = work.wrokDay();
//        System.out.println("a=" + a);

        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new WorkProxy());
        enhancer.setSuperclass(Work.class);
        Work proxy = (Work) enhancer.create();
        proxy.wrokDay();
   }

}
