package com.tema5.AbstractFactory.television;

/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the class for Samsung Interactive television
 */
public class Interactive implements Television {

    @Override
    public void createTelevision(){
        System.out.println("This is a Samsung Interactive television.");
    }
}
