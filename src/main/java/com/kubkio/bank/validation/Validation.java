package com.kubkio.bank.validation;

import com.kubkio.bank.model.ProfileModel;

public  class Validation {

    public static String validate(ProfileModel pm){

        if (pm.getFirstName().length() ==0 || pm.getLastName().length() ==0)
            return "First name and last name cannot be empty";

        //address
        if(pm.getAddress().isEmpty())
            return "Address cannot be empty";


        //ssn
            try {
                int social = Integer.parseInt(pm.getSSN());
            }catch (Exception e){
                return "Invalid Social Format";
            }
        if (pm.getSSN().length() !=9) {
            return "Social number should be 9 digits";
        }

        // email
        if(pm.getEmail().length()==0)
            return "Email cannot be empty";

        //ssn

        try {
            int social = Integer.parseInt(pm.getSSN());
        }catch (Exception e){
            return "Invalid Phone Number Format";
        }
        if (pm.getPhoneNumber().length() !=10) {
            return "Invalid Phone Number";
        }



        return null;
    }

}
