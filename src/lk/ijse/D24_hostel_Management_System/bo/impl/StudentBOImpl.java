package lk.ijse.D24_hostel_Management_System.bo.impl;

import lk.ijse.D24_hostel_Management_System.bo.custom.StudentBO;
import lk.ijse.D24_hostel_Management_System.dao.DAOFactory;
import lk.ijse.D24_hostel_Management_System.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {
    private StudentDAO sDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    @Override
    public ArrayList<StudentDTO> getAllStudents() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean saveStudent(StudentDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exitStudent(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteStudent(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewStudentID() throws SQLException, ClassNotFoundException {
        return null;
    }
}
