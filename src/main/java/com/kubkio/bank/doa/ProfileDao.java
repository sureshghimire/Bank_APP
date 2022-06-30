package com.kubkio.bank.doa;

import com.kubkio.bank.entity.ProfileEntity;
import com.kubkio.bank.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProfileDao {

    @Autowired
    ProfileRepo repo;

    public ProfileEntity makeNewProfile(ProfileEntity en){
        return repo.save(en);
    }

    public ProfileEntity getProfile(long id){
        return repo.getById(id);
    }


    // REMAIN TO WORK ON
    public ProfileEntity updateExistingProfile(long id, ProfileEntity newEntity){
        ProfileEntity currentEntity = repo.findById(id).get();
        return  newEntity;

    }

    public void delProfile(long id){
        repo.deleteById(id);
    }
}
