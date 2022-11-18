package io.github.palio2012.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class WorkshopmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopmongoApplication.class, args);
    }

}
