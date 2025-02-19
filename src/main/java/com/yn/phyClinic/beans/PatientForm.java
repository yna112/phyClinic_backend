package com.yn.phyClinic.beans;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String phoneNumber;
    private String mail;
    private String gender;
    private int weight;
    private int height;
    private String occupation;               // עיסוק / תפקיד
    private String hasInsurance;            // האם יש לך ביטוח?
    private String insuranceCompanyName;     // שם חברת הביטוח
    private String insuranceExpiryDate;      // תאריך תפוגת הביטוח (בפורמט dd/mm/yyyy)
    private String insuranceCoverageType;// סוג הכיסוי
    private String isPhysicallyActive;        // האם אתה עוסק בפעילות גופנית?
    private String reasonForPhysiotherapy;     // מדוע אתה פונה לפיזיותרפיה?
    private String mainComplaint;              // תלונה עיקרית
    private String secondaryComplaint;         // תלונה משנית
    private String painDuration;               // כמה זמן אתה חווה כאב?
    private String isPregnant;                // האם את בהריון?
    private int pregnancyWeek;                 // שבוע בהריון
    private String isBreastfeeding;           // האם את מניקה?
    private int painLevel;// רמת כאב מ-1 עד 10
    @ManyToOne
    @JoinColumn(name = "patient_id")
    @ToString.Exclude
    @JsonIgnore
    private Patient patient;


}
