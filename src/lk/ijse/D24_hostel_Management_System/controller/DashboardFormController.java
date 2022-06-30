package lk.ijse.D24_hostel_Management_System.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.D24_hostel_Management_System.util.Loader;

import java.io.IOException;

public class DashboardFormController implements Loader {
    public AnchorPane DashboardForm;

    public void manageStudentbtnOnAction(ActionEvent actionEvent) throws IOException {
        loadUi("StudentForm");
    }

    public void manageRoomsbtnOnAction(ActionEvent actionEvent) {
    }

    public void checkAvailableRoomsOnaction(ActionEvent actionEvent) {
    }

    public void RoomReservationbtnOnAction(ActionEvent actionEvent) {
    }

    public void LogOutbtnOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void loadUi(String location) throws IOException {
        DashboardForm.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"));
        DashboardForm.getChildren().add(parent);
    }


    public void OnStudent(MouseEvent mouseEvent) throws IOException {
        loadUi("StudentForm");
    }

    public void manageRooms(MouseEvent mouseEvent) {
    }

    public void checkAvailableRooms(MouseEvent mouseEvent) {
    }

    public void RoomReservation(MouseEvent mouseEvent) {
    }
}
