package com.govhack.mysmartcommunityapp.model;

/**
 * Created by cibin.oommen on 7/29/2017.
 */

public class UserDetails {
    int _id;
    String _name, _email, _address, _dob;
    String _phone_number;

    public UserDetails(){   }

    public UserDetails(int id, String name, String _phone_number, String _email, String _address, String _dob){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
        this._email = _email;
        this._address = _address;
        this._dob = _dob;
    }

    public UserDetails(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
        this._email = _email;
        this._address = _address;
        this._dob = _dob;
    }
    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

    public String getPhoneNumber(){
        return this._phone_number;
    }

    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }

    public String getEmail(){
        return this._email;
    }

    public void setEmail(String email){
        this._email = email;
    }

    public String getAddress(){
        return this._address;
    }

    public void setAddress(String address){
        this._address = address;
    }

    public String getDOB(){
        return this._dob;
    }

    public void setDOB(String dob){
        this._dob = dob;
    }


}

