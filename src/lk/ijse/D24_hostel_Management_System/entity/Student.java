package lk.ijse.D24_hostel_Management_System.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @Column(name = "Student_ID", nullable = false)
    private String sId;
    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String address;
    @Column(nullable = false)
    private String contactNumber;
    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private String gender;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Reservation> reservationList = new ArrayList<>();
}
