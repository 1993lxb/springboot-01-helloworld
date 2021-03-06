package cn.ys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloWorldController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
   public String sayHello(){
        return "Hello SpringBoot！"+dataSource;
    }

}
