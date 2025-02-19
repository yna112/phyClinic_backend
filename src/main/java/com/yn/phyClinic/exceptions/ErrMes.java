package com.yn.phyClinic.exceptions;


import lombok.Getter;

@Getter
public enum ErrMes {


    THE_PATIENT_IS_NOT_EXIST(""),

    THE_THERAPY_IS_NOT_EXIST(""),

    USER_NAME_OR_PASSWORD_INVALID("");

    private String msg;

    private ErrMes(String str){
        this.msg=str;
    }




}
