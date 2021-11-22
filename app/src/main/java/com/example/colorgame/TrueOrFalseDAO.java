package com.example.colorgame;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface TrueOrFalseDAO {
    @Insert
    void insertNewItem(TrueOrFalseItem tofi);
    @Query("SELECT * FROM TrueOrFalse")
    List<TrueOrFalseItem> getAllItems();
}