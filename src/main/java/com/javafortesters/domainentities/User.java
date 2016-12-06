package com.javafortesters.domainentities;

/**
 * Created by Miłosz Maciejewicz on 18/11/2016.
 */

public class User {

    private String username;
    private String password;

    public User(){
        this("username", "password");
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    /**public User(){
     username = "username";
     password = "password";
     }
     */
}






