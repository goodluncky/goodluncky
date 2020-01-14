package com.goodluncky.service.impl;

import com.goodluncky.domain.Address;
import com.goodluncky.service.UserInfoService;

import java.util.ArrayList;
import java.util.List;

public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public List<Address> queryAddress(Integer userId) {
        List<Address> addresses = new ArrayList<>();
        //根据userid给出不同的地址
        if( 1==userId ){
            Address address = new Address();
            address.setName("张尚");
            address.setCity("北京");
            address.setStreet("大望路");
            address.setZipcode("10010");
            address.setMobile("13928121004");
            address.setUse(true);
            addresses.add(address);

            address = new Address();
            address.setName("张尚第二个地址");
            address.setCity("北京第二个地址");
            address.setStreet("大望路第二个地址");
            address.setZipcode("10010");
            address.setMobile("13928121004");
            address.setUse(false);
            addresses.add(address);
        } else if ( 2==userId ){
            Address address = new Address();
            address.setName("李芳");
            address.setCity("上海");
            address.setStreet("平安大道");
            address.setZipcode("20010");
            address.setMobile("13828121004");
            address.setUse(true);
            addresses.add(address);
        }
        return addresses;
    }
}
