package com.backend.dynomix.restapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template =" Hello";

    @GetMapping("/login")
    public Boolean loging(@RequestParam(value = "user") String user,@RequestParam(value = "pass") String pass){
        Login log=new Login(user,pass);
        return log.loginProcess();
    }

    @GetMapping("/greet")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        final Long id =Long.parseLong((int)Math.floor(Math.random()*100000000)+"");
        return new Greeting(id,template+" "+ name);
    }
}
