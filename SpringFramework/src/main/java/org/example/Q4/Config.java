package org.example.Q4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {

    @Bean("e1")
    public Employee employee(){
        return new Employee(1,"Rakesh Jhunjhunwala");
    }

}
