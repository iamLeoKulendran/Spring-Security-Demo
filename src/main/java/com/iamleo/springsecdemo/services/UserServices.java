package com.iamleo.springsecdemo.services;

import com.iamleo.springsecdemo.model.User;
import com.iamleo.springsecdemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder encoder =new BCryptPasswordEncoder(12);

    public User savaUser (User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);
    }


}
