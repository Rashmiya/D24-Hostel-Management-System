package lk.ijse.D24_hostel_Management_System.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import lk.ijse.D24_hostel_Management_System.bo.BOFactory;
import lk.ijse.D24_hostel_Management_System.bo.custom.StudentBO;
import lk.ijse.D24_hostel_Management_System.dto.StudentDTO;
import lk.ijse.D24_hostel_Management_System.util.Loader;
import lk.ijse.D24_hostel_Management_System.view.tm.StudentTM;
import org.controlsfx.control.Notifications;
import java.io.IOException;
import java.sql.SQLException;

public class StudentFormController implements Loader {
    public AnchorPane manageStudentForm;
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
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

    StudentBO studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);

    public void initialize() {
        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.add("Male");
        obList.add("Female");

        cmbGender.setItems(obList);
    }
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
        if (datePickerDOB.getValue() != null) {
            if (btnSave.getText().equalsIgnoreCase("Save")) {
                if (cmbGender.getValue() != null) {
                    /*Save Student*/
                    try {
                        if (studentBO.saveStudent(new StudentDTO(txtId.getText(), txtName.getText(), txtAddress.getText(), txtContact.getText(), datePickerDOB.getValue(), (String) cmbGender.getValue()))) {

                            Notifications notify = Notifications.create();
                            notify.title("Student Added !");
                            notify.text(" You Successfully Added Student.");
                            notify.graphic(null);
                            notify.hideAfter(Duration.seconds(7));
                            notify.position(Pos.BOTTOM_RIGHT);
                            notify.showConfirm();

                            /*loadStudents(sBO.getAllStudents());*/
                        } else {
                            new Alert(Alert.AlertType.ERROR,"Something Went Wrong!. Please Check Again.").show();
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    } catch (ClassNotFoundException classNotFoundException) {
                        classNotFoundException.printStackTrace();
                    }
                } else {
                    new Alert(Alert.AlertType.ERROR, "Gender Type Not Selected!. Please Select It.", ButtonType.OK).show();
                }
            } else {
                /*Update Student*/
                try {
                    if (studentBO.updateStudent(new StudentDTO(txtId.getText(), txtName.getText(), txtAddress.getText(), txtContact.getText(), datePickerDOB.getValue(), (String) cmbGender.getValue()))) {

                        Notifications notify = Notifications.create();
                        notify.title("Student Added !");
                        notify.text(" You Successfully Added Student.");
                        notify.graphic(null);
                        notify.hideAfter(Duration.seconds(7));
                        notify.position(Pos.BOTTOM_RIGHT);
                        notify.showConfirm();
                       /* loadStudents(sBO.getAllStudents());*/
                    } else {
                        new Alert(Alert.AlertType.ERROR,"Something Went Wrong!. Please Check Again.").show();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } else {
            new Alert(Alert.AlertType.ERROR, "Please Select your DOB", ButtonType.OK).show();
        }
    }

    public void updateStudentOnAction(ActionEvent actionEvent) {
    }
}
