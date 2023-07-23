package com.example.Doctor.Appointment.App.service;

import com.example.Doctor.Appointment.App.model.Patient;
import com.example.Doctor.Appointment.App.repository.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    IPatientRepo patientRepo;
    public void createPatient(Patient patient) {
        patientRepo.save(patient);
    }

    public List<Patient> getAllPatient() {
        return patientRepo.findAll();
    }
}
