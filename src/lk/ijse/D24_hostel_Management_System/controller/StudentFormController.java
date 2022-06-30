package lk.ijse.D24_hostel_Management_System.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import lk.ijse.D24_hostel_Management_System.bo.BOFactory;
import lk.ijse.D24_hostel_Management_System.bo.custom.StudentBO;
import lk.ijse.D24_hostel_Management_System.util.Loader;
import lk.ijse.D24_hostel_Management_System.view.tm.StudentTM;

import java.io.IOException;

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
        if (datePickerDOB.getValue() != null) {
            if (btnSave.getText().equals("Save")) {
                if (cmbGender.getValue() != null) {
                    /*Save Student*/
                    if (sBO.saveStudent(new StudentDTO(txtStudentID.getText(), txtStudentName.getText(), txtAddress.getText(), txtContactNo.getText(), dtpckrDOB.getValue(), cmbGender.getValue()))) {
                        NotificationUtil.playNotification(AnimationType.POPUP, "Student Saved Successfully!", NotificationType.SUCCESS, Duration.millis(3000));
                        btnCancel.fire();
                        loadStudents(sBO.getAllStudents());
                    } else {
                        NotificationUtil.playNotification(AnimationType.POPUP, "Something Went Wrong !", NotificationType.ERROR, Duration.millis(3000));
                    }
                } else {
                    new Alert(Alert.AlertType.ERROR, "Gender Not Selected!", ButtonType.OK).show();
                }
            } else {
                if (sBO.updateStudent(new StudentDTO(txtStudentID.getText(), txtStudentName.getText(), txtAddress.getText(), txtContactNo.getText(), dtpckrDOB.getValue(), cmbGender.getValue()))) {
                    NotificationUtil.playNotification(AnimationType.POPUP, "Student Updated Successfully!", NotificationType.SUCCESS, Duration.millis(3000));
                    btnCancel.fire();
                    loadStudents(sBO.getAllStudents());
                } else {
                    NotificationUtil.playNotification(AnimationType.POPUP, "Something Went Wrong !", NotificationType.ERROR, Duration.millis(3000));
                }
            }

        } else {
            new Alert(Alert.AlertType.ERROR, "Date Of Birth Is Not Selected Or You Are Not Over 18 Years!", ButtonType.OK).show();

        }
    } catch (Exception e) {
        e.printStackTrace();
        new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK).show();
    }
    }

    public void updateStudentOnAction(ActionEvent actionEvent) {
    }
}
