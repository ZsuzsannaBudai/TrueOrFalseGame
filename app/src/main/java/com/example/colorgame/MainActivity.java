package com.example.colorgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TrueOrFalseDatabase trueOrFalseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueOrFalseDatabase = Room.databaseBuilder(
                this,
                TrueOrFalseDatabase.class,
                "trueorfalse_db")
                .fallbackToDestructiveMigration()
                .build();
    }

    public void openGyroscope(View view) {
        startActivity(new Intent(MainActivity.this, GyroscopeActivity.class));
    }
}