package gui;

import gui.util.Alertas;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private TextField txtNum1;
	
	@FXML
	private TextField txtNum2;
	
	@FXML
	private Label labelResultado;
	
	@FXML
	private Button btSoma;
	
	@FXML
	public void onBtSomaAction() {
		try {
			
			double numero1 = Double.parseDouble(txtNum1.getText());
			double numero2 = Double.parseDouble(txtNum2.getText());
			double soma = numero1 + numero2;
			labelResultado.setText(String.format("%.2f", soma));
		}
		catch(NumberFormatException e) {
			Alertas.showAlert("Erro", "Digite apenas números", e.getMessage(), AlertType.ERROR);
		}
	}
	
	
}
