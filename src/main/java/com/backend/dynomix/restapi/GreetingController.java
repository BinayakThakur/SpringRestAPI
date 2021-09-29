package com.backend.dynomix.restapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final Long id =Long.parseLong(1234+"");
    private static final String template =" Helllo";


    @GetMapping("/greet")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(id,template+" "+ name);
    }
}
