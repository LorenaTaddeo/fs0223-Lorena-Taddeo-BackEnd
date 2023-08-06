package com.epicode.progetto.security.service;

import com.epicode.progetto.security.payload.LoginDto;
import com.epicode.progetto.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
