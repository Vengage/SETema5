package com.tema5.AbstractFactory.devices;

import com.tema5.AbstractFactory.mobile.MobilePhone;
import com.tema5.AbstractFactory.television.Television;

/**
 * Created by Cosovanu Vasile on 11/16/2014.
 *
 * This is the abstract factory class for device factory
 */
public abstract class DeviceFactory {
    public abstract MobilePhone getMobilePhone(String mobilePhoneType);
    public abstract Television getTV(String televisionType);
}
