package com.example.Doctor.Appointment.App.service;

import com.example.Doctor.Appointment.App.model.Doctor;
import com.example.Doctor.Appointment.App.repository.IDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    IDoctorRepo doctorRepo;
    public void addDoctor(Doctor doc) {
        doctorRepo.save(doc);
    }

    public List<Doctor> getAllDoctor() {
        return doctorRepo.findAll();
    }
}
