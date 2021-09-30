package com.backend.dynomix.restapi;

import java.util.HashMap;

public class DataBase {
    private HashMap<String,String> registry=new HashMap<String,String>();
    public boolean check(String user,String pass){
        if(registry.containsKey(user)){
            if(registry.get(user).equals(pass)){
                return true;
            }
        }
        return false;
    }
    public DataBase() {
        registry.put("Binayak","1234");
    }
}
