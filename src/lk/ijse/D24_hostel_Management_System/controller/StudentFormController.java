package lk.ijse.D24_hostel_Management_System.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.D24_hostel_Management_System.entity.Student;
import lk.ijse.D24_hostel_Management_System.util.Loader;
import lk.ijse.D24_hostel_Management_System.view.tm.StudentTM;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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
    public TableView<StudentTM> tblStudent;
    public JFXDatePicker datePickerDOB;
    public JFXComboBox cmbGender;
    public Button btnSave;
    public Button btnUpdate;

    public void initialize(){
       /* colID.setCellValueFactory(new PropertyValueFactory("id"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory("salary"));


        try {
            loadAllStudents();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
    }

    private void loadAllStudents() {
        /*tblCustomers.getItems().clear();
        *//*Get all customers*//*
        try {
            // loose Coupling
            ArrayList<CustomerDTO> allCustomers = customerBO.getAllCustomers();

            for (CustomerDTO customer: allCustomers
            ) {
                tblCustomers.getItems().add(new CustomerTM(customer.getId(),customer.getName(),customer.getAddress()));
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }*/
    }

    private void clearFields() {
        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtContact.clear();
        datePickerDOB.setValue(null);
        cmbGender.setValue(null);
        btnUpdate.setDisable(true);
        btnSave.setDisable(false);
    }

    public void backToDashboardbtnOnAction(ActionEvent actionEvent) throws IOException {
            loadUi("DashboardForm");
    }

    @Override
    public void loadUi(String location) throws IOException {
        manageStudentForm.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"));
        manageStudentForm.getChildren().add(parent);
    }

    public void saveStudentOnAction(ActionEvent actionEvent) {

    }

    public void updateStudentOnAction(ActionEvent actionEvent) {
    }
}
