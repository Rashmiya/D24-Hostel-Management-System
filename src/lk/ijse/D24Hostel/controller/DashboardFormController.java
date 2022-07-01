package lk.ijse.D24Hostel.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.D24Hostel.util.Loader;

import java.io.IOException;
import java.net.URL;

public class DashboardFormController implements Loader {
    public AnchorPane DashboardForm;

    public void manageStudentbtnOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/lk/ijse/D24HostelManagementSystem/view/StudentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage stage = (Stage) DashboardForm.getScene().getWindow();
        stage.setScene(new Scene(load));
        stage.show();
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
        /*DashboardForm.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/lk/ijse/D24_hostel_Management_System/view/" + location + ".fxml"));
        DashboardForm.getChildren().add(parent);*/
    }


    public void OnStudent(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("/lk/ijse/D24HostelManagementSystem/view/StudentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage stage = (Stage) DashboardForm.getScene().getWindow();
        stage.setScene(new Scene(load));
        stage.show();

    }

    public void manageRooms(MouseEvent mouseEvent) {
    }

    public void checkAvailableRooms(MouseEvent mouseEvent) {
    }

    public void RoomReservation(MouseEvent mouseEvent) {
    }
}
