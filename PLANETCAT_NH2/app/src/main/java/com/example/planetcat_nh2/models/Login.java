package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("name")
    private String name;

    @SerializedName("password")
    private String password;
    
    public String getName(){ return name; }
    public String getPassword(){ return password; }

    public Login(String name, String password){
        this.name = name;
        this.password = password;
    }
}
