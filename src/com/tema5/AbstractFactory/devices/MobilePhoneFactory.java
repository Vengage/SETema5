package com.tema5.AbstractFactory.devices;


import com.tema5.AbstractFactory.mobile.Galaxy;
import com.tema5.AbstractFactory.mobile.GalaxyNote;
import com.tema5.AbstractFactory.mobile.MobilePhone;
import com.tema5.AbstractFactory.mobile.TrendPlus;
import com.tema5.AbstractFactory.television.Television;

/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the Mobile Phone Factory class
 */
public class MobilePhoneFactory extends DeviceFactory {

    @Override
    public MobilePhone getMobilePhone(String mobilePhoneType){

        if(mobilePhoneType == null){
            return null;
        }

        if(mobilePhoneType.toLowerCase().equalsIgnoreCase("galaxy")){
            return new Galaxy();
        }
        else if(mobilePhoneType.toLowerCase().equalsIgnoreCase("galaxynote")){
            return new GalaxyNote();
        }
        else if (mobilePhoneType.toLowerCase().equalsIgnoreCase("trendplus")){
            return new TrendPlus();
        }

        return null;
    }

    @Override
    public Television getTV(String televisionType){
        return null;
    }
}
