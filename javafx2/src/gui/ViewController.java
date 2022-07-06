package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	//Classe responsavel por controlar a tela//
	
	//1-declarar um atributo referente ao Button da tela 
	@FXML
	private Button btTest; 
	
	//2-criar método responsável pela ação de clicar
	//padrão do nome do método:
	//on
	//BtTest(nome do controle)
	//Action(evento que vai tratar)
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
	
	

}
