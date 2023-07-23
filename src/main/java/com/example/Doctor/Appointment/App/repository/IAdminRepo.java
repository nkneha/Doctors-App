package com.example.Doctor.Appointment.App.repository;

import com.example.Doctor.Appointment.App.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long>{
}
