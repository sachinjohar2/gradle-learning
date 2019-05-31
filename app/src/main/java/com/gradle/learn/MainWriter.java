package com.gradle.learn;


import org.apache.log4j.Logger;

public class MainWriter {

    private static final Logger LOGGER = Logger.getLogger(MainWriter.class);

    public static void main(String[] args) {
        MessageService service = new MessageService();
        LOGGER.info(service.getMessage());
    }
}
