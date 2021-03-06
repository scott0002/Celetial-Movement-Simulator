package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CMS extends Application {
	public static Stage mainStage;
	public static Scene mainScene;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage mainStage) throws Exception {
        CMS.mainStage = mainStage;
	    FXMLLoader loadder =
	       new FXMLLoader(
	           getClass().getResource("mainscene.fxml"));
	    Parent main = loadder.load();
	    mainScene = new Scene(main);
	    mainStage.setFullScreen(true);
	    mainStage.setTitle("Celestial Movement Simulator");
	    mainStage.setScene(mainScene);
	    mainStage.show();
	}
}