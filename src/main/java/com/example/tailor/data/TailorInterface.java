package com.example.tailor.data;

import com.example.tailor.models.SignUp;
import com.example.tailor.models.User;

public interface TailorInterface<T> {
    public boolean createAccount(T t);
}
