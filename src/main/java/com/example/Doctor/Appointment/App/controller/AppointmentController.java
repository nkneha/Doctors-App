package com.example.Doctor.Appointment.App.controller;

import com.example.Doctor.Appointment.App.model.Appointment;
import com.example.Doctor.Appointment.App.repository.IAppointmentRepo;
import com.example.Doctor.Appointment.App.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("appointment")
    public void createAppointment(@RequestBody Appointment appointment){
        appointmentService.createAppointment(appointment);
    }
    @GetMapping("appointment")
    public List<Appointment> getAllAppointment(){
        return appointmentService.getAllAppointment();
    }
}
