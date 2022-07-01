package lk.ijse.D24Hostel.bo;

import lk.ijse.D24Hostel.bo.impl.StudentBOImpl;

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
                return new StudentBOImpl();
            case ROOM:
                return null;
                /*return new RoomBOImpl();*/
            case RESERVATION:
                return  null;
                /*return new ReservationBOImpl();*/
            default:
                return null;
        }
    }
}
