package com.yn.phyClinic.controllers;


import com.yn.phyClinic.beans.LoginPat;
import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.PatientForm;
import com.yn.phyClinic.beans.Visit;
import com.yn.phyClinic.exceptions.ErrMes;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import com.yn.phyClinic.security.MyToken;
import com.yn.phyClinic.service.PatientFormService;
import com.yn.phyClinic.service.PatientService;
import com.yn.phyClinic.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/patient")
//@CrossOrigin(origins = "*")  // אפשר לשים את ה-URL של ה-frontend במקום *

public class PatientController {

    @Autowired
    PatientService patientService;

    @Autowired
    VisitService visitService;

    @Autowired
    PatientFormService patientFormService;


    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    public MyToken login(@RequestBody LoginPat loginPat) throws MyPhysClinicException {
        UUID uuid=UUID.randomUUID();
        String userName= loginPat.getUserName();
        String password= loginPat.getPassword();;
        if(patientService.login(userName,password)){
            return MyToken.builder()
                    .token(UUID.randomUUID())
                    .userName(userName)
                    .build() ;
        }
        throw new MyPhysClinicException(ErrMes.USER_NAME_OR_PASSWORD_INVALID);

    }




    @PostMapping("/addPatient")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient createNewPatient(@RequestHeader("Authorization") UUID token, @RequestBody  Patient patient){
        System.out.println("למה אני לא פה?");
        return patientService.createNewPatient(patient);
    }



    @GetMapping("/getAllPatients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> getAllPatients(@RequestHeader("Authorization") UUID token){
        System.out.println("GOOD GOOD GOOD");
        System.out.println("GOOD GOOD GOOD");

        System.out.println("TOKEN: "+token);
        return patientService.getAllPatient();
    }




    @GetMapping("/getPatientById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Patient getPatientById(@PathVariable int id ) throws MyPhysClinicException {
        return   patientService.getPatientById(id);
    }



    @PostMapping("/createNewVisit{patientId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Visit createNewVisit(@RequestBody Visit visit, @PathVariable int patientId) throws MyPhysClinicException {
        System.out.println("9999999999999999999998888888888888888888888888888888888888888888888888888888888");
        return visitService.createNewVisit(visit,patientId);
    }



    @PostMapping("/createFormPatient{patientId}")
    @ResponseStatus(HttpStatus.CREATED)
    public PatientForm createFormForPatient(@RequestBody PatientForm patientForm,@PathVariable int patientId) throws MyPhysClinicException {
        return patientFormService.createNewForm(patientForm,patientId);


    }






}
