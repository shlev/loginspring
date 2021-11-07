package com.ks.loginregsitrationspring.service;

import com.ks.loginregsitrationspring.model.User;
import com.ks.loginregsitrationspring.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
