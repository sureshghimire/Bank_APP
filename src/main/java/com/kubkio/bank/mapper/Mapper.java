package com.kubkio.bank.mapper;

import com.kubkio.bank.entity.ProfileEntity;
import com.kubkio.bank.model.ProfileModel;

public class Mapper {

    public static ProfileEntity map(ProfileModel model){
        ProfileEntity entity = new ProfileEntity();
        entity.setFirstName(model.getFirstName());
        entity.setMiddleName(model.getMiddleName());
        entity.setLastName(model.getLastName());
        entity.setAddress(model.getAddress());
        entity.setSSN(model.getSSN());
        entity.setDob(model.getDob());
        entity.setEmail(model.getEmail());
        entity.setPhoneNumber(model.getPhoneNumber());

        return entity;
    }

    public static ProfileModel map(ProfileEntity en){
        ProfileModel model = new ProfileModel();
        model.setId(en.getId());
        model.setFirstName(en.getFirstName());
        model.setMiddleName(en.getMiddleName());
        model.setLastName(en.getLastName());
        model.setAddress(en.getAddress());
        model.setSSN(en.getSSN());
        model.setDob(en.getDob());
        model.setEmail(en.getEmail());
        model.setPhoneNumber(en.getPhoneNumber());

        return model;
    }
}
