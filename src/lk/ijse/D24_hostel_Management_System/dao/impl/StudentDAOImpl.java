package lk.ijse.D24_hostel_Management_System.dao.impl;

//  To write SQL Query for each related classes.

import lk.ijse.D24_hostel_Management_System.dao.custom.StudentDAO;
import lk.ijse.D24_hostel_Management_System.entity.Student;
import lk.ijse.D24_hostel_Management_System.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student entity) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Student entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exit(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Student search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
