package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entidades.Pessoa;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Pessoa> comboBoxPessoa;

	private ObservableList<Pessoa> obsLista;
	
	@FXML
	private Button btTodos;
	
	public void onBtTodosAction() {
		for(Pessoa pessoa: comboBoxPessoa.getItems()) {
			System.out.println(pessoa);
		}
	}
	
	public void onComboBoxPessoaAction() {
		
		Pessoa pessoa = comboBoxPessoa.getSelectionModel().getSelectedItem(); //Pega o item que foi selecionado no comboBox
		System.out.println(pessoa);
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Pessoa> lista = new ArrayList<>();
		lista.add(new Pessoa(1, "Maria Eduarda", "maria@gmail.com"));
		lista.add(new Pessoa(2, "João Victor", "joVic@gmail.com"));
		lista.add(new Pessoa(3, "Paula Farias", "paula@gmail.com"));

		obsLista = FXCollections.observableArrayList(lista);
		comboBoxPessoa.setItems(obsLista);

		//Personaliza a exibição na lista, aparecendo só o nome da pessoa
		Callback<ListView<Pessoa>, ListCell<Pessoa>> factory = lv -> new ListCell<Pessoa>() {
			@Override
			protected void updateItem(Pessoa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};

		comboBoxPessoa.setCellFactory(factory);
		comboBoxPessoa.setButtonCell(factory.call(null));
	}

}
