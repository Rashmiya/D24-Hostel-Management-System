package lk.ijse.D24_hostel_Management_System.view.tm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentTM {
    private String id;
    private String name;
    private String address;
    private String contactNumber;
    private LocalDate dob;
    private String gender;
    private Button btn;
}
