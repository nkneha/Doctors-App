package com.example.Doctor.Appointment.App.model;

import com.example.Doctor.Appointment.App.model.enums.PatientGender;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Patient.class,property = "patientId")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    private String patientName;
    @Email
    @Pattern(regexp = "^.+@(?!(?:admin\\\\.com)$).+$")
    private String patientEmail;
    private String patientPassword;
    private Integer patientAge;
    @Enumerated(EnumType.STRING)
    private PatientGender patientGender;
    @OneToOne(mappedBy = "patient")
    private Appointment appointment;
}
