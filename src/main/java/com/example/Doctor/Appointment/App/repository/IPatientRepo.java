package com.example.Doctor.Appointment.App.repository;

import com.example.Doctor.Appointment.App.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepo extends JpaRepository<Patient,Long> {

}
