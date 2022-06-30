package com.kubkio.bank.service;

import com.kubkio.bank.doa.ProfileDao;
import com.kubkio.bank.entity.ProfileEntity;
import com.kubkio.bank.mapper.Mapper;
import com.kubkio.bank.model.ProfileModel;
import com.kubkio.bank.repo.ProfileRepo;
import com.kubkio.bank.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileService implements ProfileSeriveInterface{

    @Autowired
    ProfileRepo repo;

    @Autowired
    ProfileDao dao;

//    @Override
//    public ProfileModel createProfile(ProfileModel model) {
//
//        //Convert profile model to profile entity using Mapper
//        ProfileEntity savedEntity = Mapper.map(model);
//
//
//        //Validate model before save
//        String validateMsg = Validation.validate(model);
//        System.out.println(validateMsg);
//
//
//        if (validateMsg !=null){
//            ProfileModel dummyModel = new ProfileModel(validateMsg);
//            //model.setMessage(validateMsg);
//            return dummyModel;
//        }else {
//
//
//            //Save entity using profileRepo
//            repo.save(savedEntity);
//
//            //covert saved entity to model using mapper
//            ProfileModel responseModel = Mapper.map(savedEntity);
//
//            //return the converted saved entity
//            return responseModel;
//        }
//    }

    @Override
    public ProfileModel createProfile(ProfileModel model) {

        //Convert profile model to profile entity using Mapper
        ProfileEntity savedEntity = Mapper.map(model);


        //Validate model before save
        String validateMsg = Validation.validate(model);
        System.out.println(validateMsg);


        if (validateMsg !=null){
            ProfileModel dummyModel = new ProfileModel(validateMsg);
            //model.setMessage(validateMsg);
            return dummyModel;
        }else {


            //save enity using profile dao
            dao.makeNewProfile(savedEntity);
            //repo.save(savedEntity);

            //covert saved entity to model using mapper
            ProfileModel responseModel = Mapper.map(savedEntity);

            //return the converted saved entity
            return responseModel;
        }
    }
    @Override
    public ProfileModel viewProfile(long id) {
        ProfileModel md = Mapper.map(dao.getProfile(id));
        return md;    }

    @Override
    public ProfileModel updateProfile(long id, ProfileModel updatedModel) {


        // Get the existing data first for the id
        //ProfileEntity currentProfile = repo.findById(id).get();
        ProfileEntity currentProfile = dao.getProfile(id);

        if(currentProfile == null) {
            ProfileModel pm = new ProfileModel();
            pm.setMessage("No data exists for the id " + id);
            return pm;
        }

        String fn = updatedModel.getFirstName();
        if(fn != null && fn.length() != 0) {
            currentProfile.setFirstName(fn);
        }

        String ln = updatedModel.getLastName();
        if(ln != null && ln.length() != 0) {
            currentProfile.setLastName(ln);
        }

        currentProfile = repo.save(currentProfile);
        return Mapper.map(currentProfile);
    }

//    @Override
//    public ProfileModel updateProfile(long id, ProfileModel updatedModel) {
//
//
//        // Get the existing data first for the id
//        ProfileEntity currentProfile = repo.findById(id).get();
//
//        if(currentProfile == null) {
//            ProfileModel pm = new ProfileModel();
//            pm.setMessage("No data exists for the id " + id);
//            return pm;
//        }
//
//        String fn = updatedModel.getFirstName();
//        if(fn != null && fn.length() != 0) {
//            currentProfile.setFirstName(fn);
//        }
//
//        String ln = updatedModel.getLastName();
//        if(ln != null && ln.length() != 0) {
//            currentProfile.setLastName(ln);
//        }
//
//        currentProfile = repo.save(currentProfile);
//        return Mapper.map(currentProfile);
//    }

    @Override
    public String deleteProfile(long id) {

        dao.delProfile(id);
        //repo.deleteById(id);
        return "Profile Deleted Successfully";
    }


}
