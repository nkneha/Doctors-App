package com.example.Doctor.Appointment.App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String adminName;
//    @Email(regexp = "^[A-Za-z0-9._%+-]+@Admin\\.com$\n")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@Admin\\.com$\n", message ="Invalid mail type for Admin !!!!")
    private String adminEmail;
    private String adminPassword;

}
