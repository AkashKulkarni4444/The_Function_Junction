package tfj_gui.gui;

import CSVLoaders.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login_View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Welcome to THE FUNCTION JUNCTION");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        CustomerLoader.LoadCustomerCSV();
        ManagerLoader.LoadCSV();
        EventCSVLoader.LoadCSV();
        VenueLoader.LoadCSV();
        BookingHistoryLoader.LoadCSV();
        MenuLoader.LoadCSV();
        launch();
    }
}