package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alertas {

	public static void showAlert(String titulo, String cabecalho, String conteudo, AlertType tipo) {
		@SuppressWarnings("static-access")
		Alert alert = new Alert(tipo.INFORMATION);

		alert.setTitle(titulo);
		alert.setHeaderText(cabecalho);
		alert.setContentText(conteudo);
		alert.show();
	}
}
