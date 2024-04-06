package com.example.tailor.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/*
* The data for the user
*/
@Table("User")
public class User {
    public enum Accountype{
        FAMILY,
        INDIVIDUAL
    }
    @Id
    @Column("user_id")
    private int user_id;

    @Column("firstname")
    private String firstname;

    @Column("lastname")
    private String lastname;
//    @Enumerated(EnumType.STRING)
    @Column("account_type")
    private String account_type;

    @Column("measurement")
    private double measurement;


    public User(int user_id, String firstname, String lastname, String account_type, double measurement) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.account_type = account_type;
        this.measurement = measurement;
    }

    public int getUser_id(){
        return user_id;
    }
    public void setUser_id(int user_id){
        this.user_id=user_id;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public double getMeasurement(){
        return measurement;
    }
    public void setMeasurement(double measurement){
        this.measurement = measurement;
    }
    public String getAccount_type(){
        return account_type;
    }
    public void setAccount_type(String account_type){
        this.account_type=account_type;
    }
}
