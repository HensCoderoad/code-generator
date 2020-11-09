package com.code;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.code.dao")
public class CodeGeneratorApplication {

    private static final Logger logger = LoggerFactory.getLogger(CodeGeneratorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
        logger.info("code generator application start!");
    }
}
