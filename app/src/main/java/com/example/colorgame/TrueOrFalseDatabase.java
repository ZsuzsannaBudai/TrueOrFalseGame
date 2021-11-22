package com.example.colorgame;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {TrueOrFalseItem.class}, version = 2, exportSchema = false)
public abstract class TrueOrFalseDatabase extends RoomDatabase {
    public abstract TrueOrFalseDAO trueOrFalseDAO();
}