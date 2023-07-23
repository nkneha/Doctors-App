package com.example.Doctor.Appointment.App.model;

import com.example.Doctor.Appointment.App.model.enums.Qualification;
import com.example.Doctor.Appointment.App.model.enums.Specialization;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Doctor.class,property = "docId")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docId;
    private String docName;
    @Enumerated(EnumType.STRING)
    private Specialization specialization;
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
    @Min(value = 200)
    @Max(value = 2000)
    private Double docConsultationFee;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointment;
}
