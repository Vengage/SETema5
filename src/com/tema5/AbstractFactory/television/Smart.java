package com.tema5.AbstractFactory.television;

/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the class for Samsung Smart television
 */
public class Smart implements Television {

    @Override
    public void createTelevision(){
        System.out.println("This is a Samsung Smart television");
    }
}
