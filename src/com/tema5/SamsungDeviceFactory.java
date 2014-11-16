package com.tema5;


import com.tema5.AbstractFactory.SamsungFactory;
import com.tema5.AbstractFactory.devices.DeviceFactory;
import com.tema5.AbstractFactory.mobile.MobilePhone;
import com.tema5.AbstractFactory.television.Television;

/**
 * Created by Cosovanu Vasile 10.11.2014
 *
 * This is the main class for Tema 5 that implements
 * an Abstract Factory Design pattern
 */
public class SamsungDeviceFactory {

    public static void main(String[] args) {


        // mobile phone
        // create the Samsung mobile phone factory
        DeviceFactory mobilePhoneFactory = SamsungFactory.getFactory("MobilePhone");

        // create a Samsung Galaxy mobile phone
        MobilePhone galaxy = mobilePhoneFactory.getMobilePhone("Galaxy");
        galaxy.createPhone();

        // create a Samsung Galaxy Note mobile phone
        MobilePhone galaxyNote = mobilePhoneFactory.getMobilePhone("GalaxyNote");
        galaxyNote.createPhone();

        // create a Samsung Trend Plus mobile phone
        MobilePhone trendPlus = mobilePhoneFactory.getMobilePhone("TrendPlus");
        trendPlus.createPhone();


        // television
        // create the Samsung television factory
        DeviceFactory televisionFactory = SamsungFactory.getFactory("Television");

        // create a Samsung Smart television
        Television smart = televisionFactory.getTV("Smart");
        smart.createTelevision();

        // create a Samsung Interactive television
        Television interactive = televisionFactory.getTV("Interactive");
        interactive.createTelevision();


    }
}
