package lk.ijse.D24Hostel.bo.impl;

import lk.ijse.D24Hostel.bo.custom.StudentBO;
import lk.ijse.D24Hostel.dao.DAOFactory;
import lk.ijse.D24Hostel.dao.custom.StudentDAO;
import lk.ijse.D24Hostel.dto.StudentDTO;
import lk.ijse.D24Hostel.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {
    private StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public ArrayList<StudentDTO> getAllStudents() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean saveStudent(StudentDTO dto) throws SQLException, ClassNotFoundException {
        return studentDAO.save(new Student(dto.getId(),dto.getName(),dto.getAddress(),dto.getContactNumber(),dto.getDob(),dto.getGender()));
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws SQLException, ClassNotFoundException {
        return studentDAO.update(new Student(dto.getId(),dto.getName(),dto.getAddress(),dto.getContactNumber(),dto.getDob(),dto.getGender()));
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
        return studentDAO.generateNewId();
    }
}
