package lk.ijse.D24Hostel.entity;

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

    public Student(String id, String name, String address, String contactNumber, LocalDate dob, String gender) {
        id = id;
        this.name = name;
        this.address = address;
        contactNumber = contactNumber;
        this.dob = dob;
        this.gender = gender;
    }
}
