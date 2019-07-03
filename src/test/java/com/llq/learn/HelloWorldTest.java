package com.llq.learn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 7/3/19.
 */
public class HelloWorldTest {
    @Test
    public void sayHello() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.SayHello();
    }

}