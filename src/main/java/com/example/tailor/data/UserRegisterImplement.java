package com.example.tailor.data;

import com.example.tailor.models.SignUp;
import com.example.tailor.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class UserRegisterImplement implements UserRegisterInterface<User, SignUp> {

    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;


    @Autowired
    public UserRegisterImplement(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.dataSource = dataSource;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean register(User user) {
        jdbcTemplate.update( "INSERT INTO User(firstname,lastname,account_type,measurement) VALUES (?,?,?,?)",
                user.getFirstname(),
                user.getLastname(),
                user.getAccount_type(),
                user.getMeasurement()
        );
        return true;
    }

    @Override
    public String signIn(SignUp t) {
        return null;
    }

}
