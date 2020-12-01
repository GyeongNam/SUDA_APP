package com.cookandroid.ccit_suda.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;

@Entity(tableName = "talk_Contents")
public class Talk implements Serializable {
    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getChatlist() {
        return chatlist;
    }

    public void setChatlist(String chatlist) {
        this.chatlist = chatlist;
    }

    public int getChat_room() {
        return chat_room;
    }

    public void setChat_room(int chat_room) {
        this.chat_room = chat_room;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idx") private Integer idx;
    @ColumnInfo(name = "user") private String user;
    @ColumnInfo(name = "chatlist")private String chatlist;
    @ColumnInfo(name = "chat_room")private int chat_room;
    @ColumnInfo(name = "date") private String date;

    public Talk(Integer idx, String user, String chatlist, int chat_room, String date) {
        this.idx = idx;
        this.user = user;
        this.chatlist = chatlist;
        this.chat_room = chat_room;
        this.date = date;
    }
}