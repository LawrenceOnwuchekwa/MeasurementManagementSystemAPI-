package com.example.tailor.data;

import com.example.tailor.models.SignUp;
import com.example.tailor.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class TailorInterfaceImplement implements TailorInterface<SignUp>{
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public boolean createAccount(SignUp sign) {
        jdbcTemplate.update( "INSERT INTO Account(username,password) VALUES (?,?)",
                sign.getUsername(),
                sign.getPassword()
        );
        return true;
    }



}
