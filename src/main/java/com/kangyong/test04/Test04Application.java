package com.kangyong.test04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//http://localhost:8080/swagger-ui/index.html
public class Test04Application {

    public static void main(String[] args) {
        SpringApplication.run(Test04Application.class, args);
    }

}
