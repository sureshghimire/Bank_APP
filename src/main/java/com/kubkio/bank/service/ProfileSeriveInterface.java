package com.kubkio.bank.service;

import com.kubkio.bank.model.ProfileModel;

public interface ProfileSeriveInterface {
    public ProfileModel createProfile(ProfileModel model);

    public ProfileModel viewProfile(long id);

    public ProfileModel updateProfile(long id, ProfileModel newModel);

    public String deleteProfile(long id);

}
