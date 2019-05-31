package com.gradle.learn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageServiceTest {
    private MessageService service;

    @Before
    public void setUp() {
        service = new MessageService();
    }

    @After
    public void tearDown(){
        service = null;
    }

    @Test
    public void testMessagesService(){
        Assert.assertEquals("Hello Jack", service.getMessage());
    }
}
