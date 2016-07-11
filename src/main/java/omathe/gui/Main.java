package omathe.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * Main class of the application
 * @author olivier MATHE
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        
        BorderPane root = FXMLLoader.load(getClass().getResource("/main.fxml"));
	    
        stage.setTitle("Photo-archiver");
        stage.setScene(new Scene(root));
        stage.show();
        
    }
}
