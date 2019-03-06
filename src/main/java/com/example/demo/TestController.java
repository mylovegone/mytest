package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "test",value = "/zhang")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(name = "test",value = "/test", method = RequestMethod.POST)
    public Object test(String name){
        logger.info(name);
        String name1 = name;
        return "test ok" + name1 + "\n";
    }

    @RequestMapping(name = "getest", value = "/hello",method = RequestMethod.GET)
    public Object testGet(){
        logger.error("一条龙服务");
        return "test get ok!";
    }

}
