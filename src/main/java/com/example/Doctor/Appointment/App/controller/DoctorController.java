package com.example.Doctor.Appointment.App.controller;

import com.example.Doctor.Appointment.App.model.Doctor;
import com.example.Doctor.Appointment.App.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("doctor")
    public void addDoctor(@RequestBody Doctor doc){
         doctorService.addDoctor(doc);
    }
    @GetMapping("doctor")
    public List<Doctor> getAllDoctor(){
        return doctorService.getAllDoctor();
    }
}
