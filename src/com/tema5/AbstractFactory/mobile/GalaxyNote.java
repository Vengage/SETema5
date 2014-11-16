package com.tema5.AbstractFactory.mobile;


/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the class for Samsung Galaxy Note Mobile phone
 */
public class GalaxyNote implements MobilePhone {

    @Override
    public void createPhone(){
            System.out.println("This is a Samsung Galaxy Note mobile phone.");
    }
}
