package lk.ijse.D24_hostel_Management_System.dao;

import lk.ijse.D24_hostel_Management_System.dao.impl.JoinQueryDAOImpl;
import lk.ijse.D24_hostel_Management_System.dao.impl.ReservationDAOImpl;
import lk.ijse.D24_hostel_Management_System.dao.impl.RoomDAOImpl;
import lk.ijse.D24_hostel_Management_System.dao.impl.StudentDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }

    public SuperDAO getDAO(DAOTypes DAOTypes) {
        switch (DAOTypes) {
            case STUDENT:
                return new StudentDAOImpl();
            case ROOM:
                return new RoomDAOImpl();
            case RESERVATION:
                return new ReservationDAOImpl();
            case JOINQUERY:
                return new JoinQueryDAOImpl();
            default:
                return null;
        }
    }

    public enum DAOTypes {
         STUDENT, ROOM, RESERVATION, JOINQUERY
    }
}
