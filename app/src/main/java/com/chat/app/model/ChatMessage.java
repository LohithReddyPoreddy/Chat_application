package com.chat.app.model;

import lombok.Data;

@Data

public class ChatMessage {
    private long id;
    private String sender;
    private String content;

    // Default constructor (required by Jackson)
    public ChatMessage() {
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
