package com.jivatech.replacehost;


import com.jivatech.replacehost.repository.entity.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReplacehostApplication extends Table
{

    public static void main(String[] args)
    {
        SpringApplication.run(ReplacehostApplication.class, args);

    }


}
