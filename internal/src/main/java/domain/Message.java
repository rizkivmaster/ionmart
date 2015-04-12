package com.ionmart.domain;

public class Message{
    private final String _id;
    //should be an account id;
    private final String _senderId;
    private final String _content;

    public Message(String _id, String _senderId, String _content) {
        this._id = _id;
        this._senderId = _senderId;
        this._content = _content;
    }

    public String get_id() {
        return _id;
    }

    public String get_senderId() {
        return _senderId;
    }

    public String get_content() {
        return _content;
    }
}