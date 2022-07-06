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
import model.entities.Person;

public class ViewController implements Initializable {

	// criar atributo de associação com o comboBox da tela
	@FXML
	private ComboBox<Person> comboBoxPerson;
	@FXML
	private Button btnALL;
	

	// carregar a lista de pessoas na combo, tipo de lista que fica associada ao
	// componente visual
	private ObservableList<Person> obsList;
	
	
	
	//Eventos -> mostra os dados no console da IDE
	@FXML
	public void onBtnAllAction() {
		for(Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}	
	}
	
	@FXML
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem(); //pega o item selecionado
		System.out.println(person);
	}
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// inicializar a lista
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Amanda", "amanda@email.com"));
		list.add(new Person(2, "Bruno", "bruno@email.com"));
		list.add(new Person(3, "Carolina", "carol@email.com"));
		list.add(new Person(4, "Daniel", "dani@email.com"));
		list.add(new Person(5, "Elena", "elena@email.com"));
		list.add(new Person(6, "Fernando", "fefe@email.com"));
		list.add(new Person(7, "Gabriela", "gabi@email.com"));
		list.add(new Person(8, "Hugo", "hugo@email.com"));

		// instanciar obsList
		obsList = FXCollections.observableList(list);
		comboBoxPerson.setItems(obsList);

		// customizar a visualização do comboBox
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));

	}

}
