package lk.ijse.D24_hostel_Management_System.dao.impl;

import lk.ijse.D24_hostel_Management_System.dao.custom.RoomDAO;
import lk.ijse.D24_hostel_Management_System.entity.Room;

import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDAOImpl implements RoomDAO {
    @Override
    public boolean save(Room dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Room dto) throws SQLException, ClassNotFoundException {
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
    public ArrayList<Room> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Room search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }
}
