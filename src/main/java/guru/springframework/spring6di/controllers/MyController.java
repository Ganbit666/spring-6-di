package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHallow(){
        System.out.println("I'm in the controller");

        return "Hello Everyone!!!";
    }
}
