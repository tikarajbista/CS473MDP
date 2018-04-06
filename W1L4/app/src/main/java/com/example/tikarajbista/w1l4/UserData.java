package com.example.tikarajbista.w1l4;

import java.util.ArrayList;

public class UserData {
    private  static UserData userData = null;

    // ArrayList of User type
    public static ArrayList user;

    private UserData(){
        this.user = new ArrayList<User>();
    }

    // static method to create singleton and access it
    public static UserData getUserData(){
        if(userData == null){
            new UserData();
        }
        return userData;
    }

    public static ArrayList getUser() {
        return user;
    }
}
