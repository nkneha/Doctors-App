package com.example.Doctor.Appointment.App.service;

import com.example.Doctor.Appointment.App.model.Appointment;
import com.example.Doctor.Appointment.App.model.Doctor;
import com.example.Doctor.Appointment.App.model.Patient;
import com.example.Doctor.Appointment.App.repository.IAppointmentRepo;
import com.example.Doctor.Appointment.App.repository.IDoctorRepo;
import com.example.Doctor.Appointment.App.repository.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    IAppointmentRepo appointmentRepo;

    @Autowired
    IPatientRepo patientRepo;

    @Autowired
    IDoctorRepo doctorRepo;
    public void createAppointment(Appointment appointment) {
        // id to check doctor is valid or not
        Long doctorId = appointment.getDoctor().getDocId();
        Boolean isValidDoctor = doctorRepo.existsById(doctorId);
        // id to check patient is valid or not
        Long patId = appointment.getPatient().getPatientId();
        Boolean isValidPatient = patientRepo.existsById(patId);

        if (isValidDoctor && isValidPatient) {
            appointmentRepo.save(appointment);
        } else {
            throw new IllegalStateException("Appointment meta data invalid");
        }
    }

    public List<Appointment> getAllAppointment() {
        return appointmentRepo.findAll();
    }
}
