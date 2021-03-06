package com.unixteam.entity;

import java.io.Serializable;


public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String role;
    private String username;
    private String login;
    private String password;
    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {return login;}

    public void setLogin(String login) {this.login = login; }

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
