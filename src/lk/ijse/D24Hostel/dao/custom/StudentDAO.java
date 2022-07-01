package lk.ijse.D24Hostel.dao.custom;

//To write unique methods for student table
// must extend CrudDAO interface

import lk.ijse.D24Hostel.dao.CrudDAO;
import lk.ijse.D24Hostel.entity.Student;

public interface StudentDAO extends CrudDAO<Student,String> {

}
