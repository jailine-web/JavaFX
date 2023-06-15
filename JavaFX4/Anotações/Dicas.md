

##Ao clonar/duplicar o projeto pode ser necessário inserir essa configuração novamente para o projeto rodar corretamente:

#### - Botão direito no projeto -> Run As -> Run Configurations -> Arguments -> VM Arguments
####- Copiar o conteúdo abaixo, adaptando para sua pasta:
#### --module-path "C:\Java-libs\javafx-sdk-17.0.7\lib" --add-modules=javafx.fxml,javafx.controls

##FXML: é uma linguagem de marcação para desenhar a tela com o scene.

##@FXML: esta anotação é responsável por declarar um atributo correspondente controle da tela(junção da classe de controller com a view(telinha))

## Passo no Scenebuilder

#### - Associar a view ao controller (aba Controller)
#### - Selecione o controle e associe a ele o id (aba Code)
#### - Selecione o controle e associe o método ao evento desejado (aba Code)

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



