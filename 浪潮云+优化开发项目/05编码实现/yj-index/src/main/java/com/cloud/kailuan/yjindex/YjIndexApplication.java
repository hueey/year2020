package com.cloud.kailuan.yjindex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class YjIndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjIndexApplication.class, args);
    }

}
