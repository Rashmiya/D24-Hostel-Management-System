package lk.ijse.D24_hostel_Management_System.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import lk.ijse.D24_hostel_Management_System.entity.Student;
import lk.ijse.D24_hostel_Management_System.util.Loader;

import java.io.IOException;

public class StudentFormController implements Loader {
    public AnchorPane manageStudentForm;
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public JFXDatePicker txtDOB;
    public JFXComboBox<String> txtGender;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colContactNumber;
    public TableColumn colDOB;
    public TableColumn colGender;
    public TableColumn colModify;
    public TableView<Student> tblStudent;

    public void backToDashboardbtnOnAction(ActionEvent actionEvent) throws IOException {
            loadUi("DashboardForm");
    }

    @Override
    public void loadUi(String location) throws IOException {
        manageStudentForm.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"));
        manageStudentForm.getChildren().add(parent);
    }
}
