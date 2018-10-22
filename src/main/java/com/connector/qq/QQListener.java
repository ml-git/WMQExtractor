package com.connector.qq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.Message;
import javax.jms.MessageListener;

public class QQListener implements MessageListener {

    private static final Logger logger = LoggerFactory
            .getLogger(QQListener.class);


    public void onMessage(Message message) {
        new FileReader().writeFile(message);
    }

}
