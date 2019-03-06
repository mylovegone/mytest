package com.example.demo.aop;

import java.lang.reflect.Proxy;

public class StudyImpl implements Study {

    @Override
    public void studyEn() {
        System.out.println("学习英文");
    }

    @Override
    public void studyCN() {
        System.out.println("学习中文");
    }

    public static void main(String[] args){
        Study proxy = (Study) Proxy.newProxyInstance(Study.class.getClassLoader(),new Class[]{Study.class},new MyStudyProxy(new StudyImpl()));
        proxy.studyEn();
        int a =2;
        char i = 'A';
        int b = i;
        System.out.println(i);
        System.out.println(b);
         a = a + i ;
         System.out.println(a);

    }
}
