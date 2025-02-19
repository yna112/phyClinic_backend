package com.yn.phyClinic.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Therapy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String therapyName;
    private Date date;
    private LocalTime time;
    //יוצר כאן את שם המטופל של אותו טיפול ספציפי - בשביל שיהיה יותר נוח להציג בui (לא בטוח שזה נכון, צריך לבדוק)
    private String patientFirstName;
    private String patientLastName;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @ToString.Exclude
    @JsonIgnore
    private Patient patient;


}
