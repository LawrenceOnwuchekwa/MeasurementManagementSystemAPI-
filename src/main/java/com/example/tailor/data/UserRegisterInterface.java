package com.example.tailor.data;

public interface UserRegisterInterface<T,X>{
    public boolean register(T t);

    public String signIn(X t);
}
