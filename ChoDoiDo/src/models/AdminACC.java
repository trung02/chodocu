/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author chuon
 */
public class AdminACC {
    String username,password;
    public AdminACC() {
    }
    public AdminACC(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getADPassword() {
        return password;
    }

    public void setADPassword(String password) {
        this.password = password;
    }
}

