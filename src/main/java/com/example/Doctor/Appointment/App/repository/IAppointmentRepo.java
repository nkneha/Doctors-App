package com.example.Doctor.Appointment.App.repository;

import com.example.Doctor.Appointment.App.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {

}
