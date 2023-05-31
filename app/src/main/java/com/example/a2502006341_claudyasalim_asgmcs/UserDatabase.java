package com.example.a2502006341_claudyasalim_asgmcs;

import static androidx.constraintlayout.widget.ConstraintLayoutStates.TAG;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;

public class UserDatabase implements Serializable {

    private ArrayList<User> usersList = new ArrayList<>();

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public User getUser(int id){
        for (User user:usersList){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public void printUsers(){
        for (User user:usersList) {
            Log.i(user.getId() + "Name: ", user.getName());
            Log.i(user.getId() + "Email: ", user.getEmail());
            Log.i(user.getId() + "Phone: ", user.getPhone());
            Log.i(user.getId() + "Password: ", user.getPass());
            Log.i("", "Next User");
        }
    }

    public User verify(String email, String pass){
        for (User user:usersList) {
            if(email.equals(user.getEmail()) && pass.equals(user.getPass())){
                return user;
            }
        }
        return null;
    }
}
