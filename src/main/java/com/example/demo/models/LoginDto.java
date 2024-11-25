package com.example.demo.models;

import lombok.Data;

@Data
public class LoginDto {
	private String usernameOrEmail;
	private String password;
}
