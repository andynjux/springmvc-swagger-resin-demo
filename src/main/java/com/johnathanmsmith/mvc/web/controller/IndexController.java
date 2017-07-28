package com.johnathanmsmith.mvc.web.controller;

import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/ask")
class IndexController
{
    /**
     * mvn jetty:run
     * http://127.0.0.1:8080/springmvc-helloworld/swagger/index.html#!
     */

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    org.slf4j.LoggerFactory a;
    @RequestMapping(method = RequestMethod.GET)
    public String displayRequestPage()
    {
        /*
           I am going to display the helloworld.jsp page now :)
         */
        logger.debug("made it to controller");
        return "helloworld";

    }

    @RequestMapping(value="/hello", headers="Accept=*/*")
    @ResponseBody
    public String simplePattern(){
        System.out.println("simplePattern method was called");
        return "someResult";
    }

    @RequestMapping(value="/json")
    public @ResponseBody JSONObject jsonTest(){
        System.out.println("simplePattern method was called");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "test");
        return jsonObject;
    }


    @RequestMapping(value="/user")
    public @ResponseBody User user(){
        System.out.println("simplePattern method was called");
        User user = new User();
        user.name= "hello";
        return user;
    }
}
