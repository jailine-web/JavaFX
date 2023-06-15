package gui;

import gui.util.Alertas;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTeste;
	
	@FXML
	public void onBtTesteAction() {
		Alertas.showAlert("Titulo do alerta", "Cabeçalho do alerta", 
				"Conteúdo do alerta", AlertType.INFORMATION);
	}
}
