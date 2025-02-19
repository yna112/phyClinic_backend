package com.yn.phyClinic.exceptions;

public class MyPhysClinicException extends Exception{
    public MyPhysClinicException(ErrMes errMes){
        super(errMes.getMsg());

    }
}
