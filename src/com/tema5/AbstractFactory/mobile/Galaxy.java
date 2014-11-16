package com.tema5.AbstractFactory.mobile;


/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the class for Samsung Galaxy Mobile Phone
 */
public class Galaxy implements MobilePhone {

    @Override
    public void createPhone(){
            System.out.println("This is a Samsung Galaxy mobile phone.");
    }
}
