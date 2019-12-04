package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "org.java.dao")
@SpringBootApplication
public class SpringbootTkmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTkmybatisApplication.class, args);
    }

}
