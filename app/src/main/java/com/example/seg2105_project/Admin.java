package com.example.seg2105_project;

import java.util.ArrayList;

/**
 * Admin class contains the admin information and methods
 */
public class Admin{

    String adminId;
    String adminPassword;

    /**
     * Constructor which sets ID and password to "111"
     */
    Admin(){
        adminId = "111";
        adminPassword = "111";
    }

    /**
     * returns Admin ID
     * @return adminID
     */
    public String getAdminId(){
        return adminId;
    }

    /**
     * returns Admin password
     * @return adminPassword
     */
    public String getAdminPassword(){
        return adminPassword;
    }

}
