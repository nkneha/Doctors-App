package com.example.Doctor.Appointment.App.controller;

import com.example.Doctor.Appointment.App.model.Doctor;
import com.example.Doctor.Appointment.App.model.Patient;
import com.example.Doctor.Appointment.App.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("patient")
    public void createPatient(@RequestBody Patient patient){
        patientService.createPatient(patient);
    }
    @GetMapping("patient")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }
}
