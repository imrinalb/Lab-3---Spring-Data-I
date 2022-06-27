package com.product.assignment3prob;

import com.product.assignment3prob.Entity.User;
import com.product.assignment3prob.Repository.IUserRepository;
import com.product.assignment3prob.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Assignment3ProbApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(Assignment3ProbApplication.class, args);
        IUserRepository iUserRepository= context.getBean(IUserRepository.class);

//        User user= iUserRepository.getUserById(1);
//        System.out.println("Users are: " +user);

    }

}
