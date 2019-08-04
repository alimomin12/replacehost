package com.jivatech.replacehost;


import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReplacehostApplication extends Customer
{

    public static void main(String[] args)
    {
        SpringApplication.run(ReplacehostApplication.class, args);

    }


}
