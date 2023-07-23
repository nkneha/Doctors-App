package com.example.Doctor.Appointment.App.controller;

import com.example.Doctor.Appointment.App.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
}
