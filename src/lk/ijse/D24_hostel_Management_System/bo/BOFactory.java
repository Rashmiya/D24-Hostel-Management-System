package lk.ijse.D24_hostel_Management_System.bo;

import lk.ijse.D24_hostel_Management_System.bo.impl.ReservationBOImpl;
import lk.ijse.D24_hostel_Management_System.bo.impl.RoomBOImpl;
import lk.ijse.D24_hostel_Management_System.bo.impl.StudentBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }
    public static BOFactory getInstance(){
        return (boFactory == null ? boFactory = new BOFactory() : boFactory);
    }

    public enum BOTypes{
        STUDENT, ROOM, RESERVATION
    }
    public SuperBO getBO(BOTypes types){
        switch (types){
            case STUDENT:
                return new CustomerBOImpl();
            case ROOM:
                return new ItemBOImpl();
            case RESERVATION:
                return new PurchaseOrderBOImpl();
            default:
                return null;
        }
    }
}
