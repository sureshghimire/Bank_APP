package com.kubkio.bank.model;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.Date;

public class ProfileModel {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String SSN;
    private Date dob;
    private String email;
    private String phoneNumber;
    private String message;

    public ProfileModel(String firstName, String middleName, String lastName, String address, String SSN, Date dob, String email, String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.SSN = SSN;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public ProfileModel(String message) {
        this.message = message;
    }

    public ProfileModel(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
