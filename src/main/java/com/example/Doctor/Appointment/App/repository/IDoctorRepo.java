package com.example.Doctor.Appointment.App.repository;

import com.example.Doctor.Appointment.App.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor,Long> {
}
