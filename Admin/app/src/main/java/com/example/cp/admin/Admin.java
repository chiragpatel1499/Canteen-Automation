package com.example.cp.admin;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Admin extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}
