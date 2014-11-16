package com.tema5.AbstractFactory.devices;

import com.tema5.AbstractFactory.mobile.MobilePhone;
import com.tema5.AbstractFactory.television.Interactive;
import com.tema5.AbstractFactory.television.Smart;
import com.tema5.AbstractFactory.television.Television;

/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the Television Factory class
 */
public class TVFactory extends DeviceFactory {

    @Override
    public MobilePhone getMobilePhone(String mobilePhoneType){
        return null;
    }

    @Override
    public Television getTV(String televisionType){

            if(televisionType == null){
                return null;
            }

            if(televisionType.toLowerCase().equalsIgnoreCase("smart")){
                return new Smart();
            }
            else if(televisionType.toLowerCase().equalsIgnoreCase("interactive")){
                return new Interactive();
            }

            return null;
    }
}
