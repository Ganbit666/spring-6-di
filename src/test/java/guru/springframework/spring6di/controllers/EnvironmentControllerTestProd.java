package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class EnvironmentControllerTestProd {
    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnv(){
        System.out.println(environmentController.getEnv());
    }
}