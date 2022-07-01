package lk.ijse.D24Hostel.bo.custom;

import lk.ijse.D24Hostel.bo.SuperBO;
import lk.ijse.D24Hostel.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    public ArrayList<StudentDTO> getAllStudents() throws SQLException, ClassNotFoundException;

    public boolean saveStudent(StudentDTO dto) throws SQLException, ClassNotFoundException;

    public boolean updateStudent(StudentDTO dto) throws SQLException, ClassNotFoundException;

    public boolean exitStudent(String id) throws SQLException, ClassNotFoundException;

    public boolean deleteStudent(String id) throws SQLException, ClassNotFoundException;

    public String generateNewStudentID() throws SQLException, ClassNotFoundException;
}
