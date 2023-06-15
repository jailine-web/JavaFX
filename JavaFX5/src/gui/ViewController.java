package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alertas;
import gui.util.Limitacoes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
	
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
			
			Locale.setDefault(Locale.US);
			
			double numero1 = Double.parseDouble(txtNum1.getText());
			double numero2 = Double.parseDouble(txtNum2.getText());
			double soma = numero1 + numero2;
			labelResultado.setText(String.format("%.2f", soma));
		}
		catch(NumberFormatException e) {
			Alertas.showAlert("Erro", "Digite apenas números", e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Limitacoes.setTextFieldDouble(txtNum1);
		Limitacoes.setTextFieldDouble(txtNum2);
		Limitacoes.setTextFieldMaxLength(txtNum1, 7);
		Limitacoes.setTextFieldMaxLength(txtNum2, 7);
		
	}
	
	
}
