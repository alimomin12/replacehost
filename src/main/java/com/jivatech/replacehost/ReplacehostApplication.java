package com.jivatech.replacehost;


import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ReplacehostApplication extends Customer
{

    public static void main(String[] args)
    {
        SpringApplication.run(ReplacehostApplication.class, args);

        String newName;

        Scanner input = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Enter your full name");
        customer.setName(input.next());
        





    }


}
