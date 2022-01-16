package calculadoraFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller implements Initializable {

	//model 
	Calculadora calculadora=new Calculadora();

		
		@FXML
		private VBox view;
		
	    @FXML
	    private Button TodoBorrar;

	    @FXML
	    private Button borraruno;

	    @FXML
	    private Button cero;

	    @FXML
	    private Button cinco;

	    @FXML
	    private Button coma;

	    @FXML
	    private Button cuatro;

	    @FXML
	    private Button dividir;

	    @FXML
	    private Button dos;

	    @FXML
	    private Button igualacion;

	    @FXML
	    private Button multiplicar;

	    @FXML
	    private Button nueve;

	    @FXML
	    private Button ocho;

	    @FXML
	    private Button resta;

	    @FXML
	    private Button seis;

	    @FXML
	    private Button siete;

	    @FXML
	    private Button suma;

	    @FXML
	    private Button tres;
	    
	    @FXML
	    private TextField resultado;
	    
	    @FXML
	    private Button uno;
	  
	    public Controller() throws IOException {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/calculator.fxml"));
			loader.setController(this);
			loader.load();
		}
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {

			MenuItem clasicoItem=new MenuItem("Clásico");
			clasicoItem.setOnAction(e -> {
				view.getStylesheets().clear();
				view.getStylesheets().add("/CSS/calculadora.css");
			});
			MenuItem modernoItem= new MenuItem("Moderno");
			modernoItem.setOnAction(e ->{
				view.getStylesheets().clear();
				view.getStylesheets().add("/CSS/calculadora2.css");
			});
			
			ContextMenu menu =new ContextMenu(clasicoItem, modernoItem);
			view.setOnContextMenuRequested(e -> {
				menu.show(view, e.getScreenX(), e.getScreenY());
			});
	    }
	    
	    @FXML
	    void onCLickBorrarTodo(ActionEvent event) {
	    	calculadora.borrarTodo();
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickBorrarUno(ActionEvent event) {
	    	calculadora.borrar();
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickCero(ActionEvent event) {
	    	calculadora.insertar('0');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickCinco(ActionEvent event) {
	    	calculadora.insertar('5');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickComa(ActionEvent event) {
	    	calculadora.insertarComa();
	    	
	    }

	    @FXML
	    void onCLickCuatro(ActionEvent event) {
	    	calculadora.insertar('4');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickDivision(ActionEvent event) {
	    	calculadora.operar('/');
	    	
	    }

	    @FXML
	    void onCLickDos(ActionEvent event) {
	    	calculadora.insertar('2');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickIgualar(ActionEvent event) {
	    	calculadora.operar('=');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickMultiplicacion(ActionEvent event) {
	    	calculadora.operar('*');;
	    }

	    @FXML
	    void onCLickNueve(ActionEvent event) {
	    	calculadora.insertar('9');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickOcho(ActionEvent event) {
	    	calculadora.insertar('8');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickRestar(ActionEvent event) {
	    	calculadora.operar('-');;
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickSeis(ActionEvent event) {
	    	calculadora.insertar('6');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickSiete(ActionEvent event) {
	    	calculadora.insertar('7');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickSuma(ActionEvent event) {
	    	calculadora.operar('+');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickTres(ActionEvent event) {
	    	calculadora.insertar('3');
	    	resultado.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCLickUno(ActionEvent event) {
	    	calculadora.insertar('1');
	    	resultado.setText(calculadora.getPantalla());
	    }
	    
	    public VBox getView() {
			return view;
		}
	
}

