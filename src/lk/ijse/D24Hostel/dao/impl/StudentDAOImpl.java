package lk.ijse.D24Hostel.dao.impl;

//  To write SQL Query for each related classes.

import lk.ijse.D24Hostel.dao.custom.StudentDAO;
import lk.ijse.D24Hostel.entity.Student;
import lk.ijse.D24Hostel.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student entity) throws SQLException, ClassNotFoundException {
        Session session = null;
        try {
            session = FactoryConfiguration.getInstance().getSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Student entity) throws SQLException, ClassNotFoundException {
        Session session = null;
        try {
            session = FactoryConfiguration.getInstance().getSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean exit(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        Session session = null;
        try {
            session = FactoryConfiguration.getInstance().getSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Transaction transaction = session.beginTransaction();

        session.delete(session.load(Student.class, id));

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
       return null;
    }

    @Override
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException {
        return  null;
    }
       /* Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        List<Student> list = session.createQuery("FROM Student").list();

        transaction.commit();
        session.close();
        return list;*/


    @Override
    public Student search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
