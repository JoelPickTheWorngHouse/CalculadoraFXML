package calculadoraFXML;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller control;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		control=new Controller();
		
		Scene secen=new Scene(control.getView());
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(secen);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
