package com.goodluncky.service;

import com.goodluncky.domain.Address;

import java.util.List;

public interface UserInfoService {
    List<Address> queryAddress(Integer userId);
}
