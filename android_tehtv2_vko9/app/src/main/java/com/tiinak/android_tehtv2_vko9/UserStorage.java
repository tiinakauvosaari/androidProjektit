package com.tiinak.android_tehtv2_vko9;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

public class UserStorage {

    protected ArrayList<UserListAdapter.User> users = new ArrayList<>();
    protected static UserStorage userstorage = null;
    protected Context context;

    private UserStorage(){
    }

    public static UserStorage getInstance(){
        if(userstorage == null) userstorage = new UserStorage();
        return userstorage;
    }

    public void addUser(UserListAdapter.User user){
        users.add(user);
    }
    
   public void saveUsers(Context context){

        try{
            ObjectOutputStream usersWriter = new ObjectOutputStream(context.openFileOutput("usersData.data", Context.MODE_PRIVATE));
            usersWriter.writeObject(users);
            usersWriter.close();
         } catch (IOException e){
            System.out.println("Tallentaminen ei onnistunut");
        }
    }

    public void loadUsers(Context context){
        System.out.println("loadUsers Tänne tultiin");
        try{
            ObjectInputStream usersReader = new ObjectInputStream(context.openFileInput("usersData.data"));
            users = (ArrayList<UserListAdapter.User>) usersReader.readObject();
            usersReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Lukeminen ei ei onnistunut");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Lukeminen ei ei ei onnistunut");
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.out.println("Lukeminen ei ei ei ei onnistunut");
            e.printStackTrace();
        }
    }

    public ArrayList<UserListAdapter.User> getUsers() {
        return users;
    }

}
