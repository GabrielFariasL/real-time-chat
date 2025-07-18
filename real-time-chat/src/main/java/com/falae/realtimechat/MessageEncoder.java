package com.falae.realtimechat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<MessageModel>   {
    private static final Gson gson = new GsonBuilder();

    @Override
    public String encodeMessage(MessageModel message)throws EncodeException {
        return gson.toJson(message);
    }
    @Override
    public void init(EndpointConfig config) {}

    @Override
    public void destroy() {}

}
