package org.tundor.app.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.tundor.app.AppModuleApplication;

@SpringBootTest
@Execution(ExecutionMode.CONCURRENT)
public class BaseTests {
    public static ApplicationContext context;

    @BeforeAll
    public static void preSetup(){
        context = SpringApplication.run(AppModuleApplication.class);
    }
}
