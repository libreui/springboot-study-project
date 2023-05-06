package com.example.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Account {
    int id;
    String email;
    String username;
    String password;
}
