package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by delaval on 2016-03-10.
 */
@RestController
public class TestController {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name){
        return "Tja, " + name + "!";
    }

}
