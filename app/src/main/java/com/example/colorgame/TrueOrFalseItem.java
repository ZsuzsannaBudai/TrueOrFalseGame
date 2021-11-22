package com.example.colorgame;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TrueOrFalse")
public class TrueOrFalseItem {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "questionID")
    private int questionID;
    @ColumnInfo(name = "question")
    private String question;
    @ColumnInfo(name = "isTrue")
    private boolean isTrue;

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}