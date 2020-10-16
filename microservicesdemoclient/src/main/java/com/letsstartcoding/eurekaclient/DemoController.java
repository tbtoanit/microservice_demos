package com.letsstartcoding.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	

    @GetMapping("/demo")
    public DemoObject getHelloWordObject() {
    	System.out.print("Call success!");
        DemoObject demo = new DemoObject();
        demo.setMessage("Welcome to microservices Demo " );
        return demo;
    }
}
