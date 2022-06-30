package lk.ijse.D24_hostel_Management_System.dao.impl;

import lk.ijse.D24_hostel_Management_System.dao.custom.ReservationDAO;
import lk.ijse.D24_hostel_Management_System.entity.Reservation;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationDAOImpl implements ReservationDAO {
    @Override
    public boolean save(Reservation dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Reservation dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exit(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Reservation> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Reservation search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }
}
