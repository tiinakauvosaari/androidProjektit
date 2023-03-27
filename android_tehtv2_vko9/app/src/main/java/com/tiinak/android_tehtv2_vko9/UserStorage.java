package com.tiinak.android_tehtv2_vko9;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<UserListAdapter.User> users = new ArrayList<>();
    private static UserStorage userstorage = null;

    private UserStorage(){
    }

    public static UserStorage getInstance(){
        if(userstorage == null) userstorage = new UserStorage();
        return userstorage;
    }

    public void addUser(UserListAdapter.User user){
        users.add(user);
    }

    public ArrayList<UserListAdapter.User> getUsers() {
        return users;
    }
}
