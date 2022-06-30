package com.kubkio.bank.controller;

import com.kubkio.bank.model.ProfileModel;
import com.kubkio.bank.service.ProfileSeriveInterface;
import com.kubkio.bank.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ProfileService service;


//    @PostMapping
//    @RequestMapping("/sign-up")
    @RequestMapping(value = "/signup",method= RequestMethod.POST)
    public ProfileModel signUp(@RequestBody ProfileModel model){
        return service.createProfile(model);
    }

    @RequestMapping(value = "/view/{id}",method= RequestMethod.GET)
    public ProfileModel view(@PathVariable long id){
        return service.viewProfile(id);
    }

    @RequestMapping(value = "/delete/{id}",method= RequestMethod.DELETE)
    public String delete(@PathVariable long id){
        return service.deleteProfile(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public  ProfileModel update(@PathVariable long id, @RequestBody ProfileModel updatedProfile){
        return service.updateProfile(id, updatedProfile);
    }

}
