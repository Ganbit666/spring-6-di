package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    @Autowired
    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    String getEnv() {
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
