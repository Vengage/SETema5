package com.tema5.AbstractFactory;

import com.tema5.AbstractFactory.devices.DeviceFactory;
import com.tema5.AbstractFactory.devices.MobilePhoneFactory;
import com.tema5.AbstractFactory.devices.TVFactory;

/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 *
 * This is the the Samsung device factory class
 */
public class SamsungFactory {

    public static DeviceFactory getFactory(String factoryType){

        if( factoryType == null){
            return null;
        }

        if(factoryType.toLowerCase().equalsIgnoreCase("mobilephone")){
            return new MobilePhoneFactory();
        }
        else if (factoryType.toLowerCase().equalsIgnoreCase("television")){
            return new TVFactory();
        }
        return null;
    }

}
