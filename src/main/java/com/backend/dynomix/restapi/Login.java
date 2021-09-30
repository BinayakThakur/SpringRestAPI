package com.backend.dynomix.restapi;

import java.util.HashMap;

public class Login {
    private HashMap<String,String> db=new HashMap<String,String>();

    private String user;
    private String pass;
    public boolean loginProcess(){
        DataBase db=new DataBase();
        return db.check(user,pass);

    }
    public Login(String user, String pass) {

        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
