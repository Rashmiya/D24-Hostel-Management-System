import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.D24_hostel_Management_System.util.FactoryConfiguration;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("lk/ijse/D24_hostel_Management_System/view/DashboardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        primaryStage.setTitle("D24 Hostel Management System");
        primaryStage.setScene(scene);
//        primaryStage.setMaximized(true);
        primaryStage.show();

    }
}
