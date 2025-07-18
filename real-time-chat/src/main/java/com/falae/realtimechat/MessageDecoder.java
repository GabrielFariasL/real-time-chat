package com.falae.realtimechat;

import com.google.gson.Gson;
import jakarta.websocket.DecodeException;
import jakarta.websocket.EndpointConfig;

public class MessageDecoder {
    private static final Gson gson = new Gson();

    @Override
    public MessageModel decode(String message)throws DecodeException {
        return gson.fromJson(message, MessageModel.class);
    }

    @Override
    public boolean checkerMessage (String json){
        return (json != null && json.length() > 0);
    }
    @Override
    public void init(EndpointConfig config){}

    @Override
    public void destroy(){
    }
}
