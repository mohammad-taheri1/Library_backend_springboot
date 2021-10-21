package com.example.Library_backend_springboot.service;

import com.example.Library_backend_springboot.model.userModel;

import java.util.ArrayList;

public interface userService {

    public ArrayList<userModel> getAllusers();

    public userModel getSingleuser(String name, String family);

    public String checkAuthentication1(String name, String family);

    public String checkAuthentication2(userModel user);

}
