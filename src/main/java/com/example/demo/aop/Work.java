package com.example.demo.aop;

public class Work {
    public int wrokDay(){
        System.out.println("我正在学习，白天学习状态好！");
        return 1;
    }
    public static void main(String[] args) {
        WorkProxy workProxy = new WorkProxy();
        Work work = (Work) workProxy.getProxy(Work.class);
        int a = work.wrokDay();
        System.out.println("a=" + a);
    }
}
