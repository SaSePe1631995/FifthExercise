package org.example;

public class User {
    private String login;
    private String email;

    public User() {}

    public User (String login, String email){
        this.login = login;
        this.email = email;
    }

    protected boolean SetLogin (String login){
        if (login.length() >= 5)
        {
            this.login = login;
            return  true;
        }
        else return false;
    }

    protected String GetLogin(){
        return this.login;
    }

    protected boolean SetEmail (String email){
        if (email.contains("@") == true && (email.contains(".") == true))
        {
            this.email = email;
            return true;
        }
        else return false;
    }

    protected String GetEmail(){
        return this.email;
    }
}
