package lk.ijse.D24_hostel_Management_System.dao.custom;

//To write unique methods for student table
// must extend CrudDAO interface

import lk.ijse.D24_hostel_Management_System.dao.CrudDAO;
import lk.ijse.D24_hostel_Management_System.entity.Student;

public interface StudentDAO extends CrudDAO<Student,String> {

}
