package com.example.dunyasesi.ui.main;

public class ChatItem {

    int id;
    String senderProfileImageUrl;
    String senderName;
    String lastMessage;
    String email;

    ChatItem (int newId, String senderProfileImageUrl, String senderName, String newlastMessage, String email) {
        this.id = newId;
        this.senderName = senderName;
        this.lastMessage = newlastMessage;
        this.senderProfileImageUrl = senderProfileImageUrl;
        this.email = email;
    }
}