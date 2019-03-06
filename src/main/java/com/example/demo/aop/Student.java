package com.example.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    /**
     * learn English
     */
    public void learnEn(){
        logger.info("im learn English now");
    }

    /**
     * learn chinese
     */
    public void learnCn(){
        logger.info("im learn chinese now");
    }

    public void learn(){
        learnCn();
    }



}
