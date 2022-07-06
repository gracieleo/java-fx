package gui.util;

import javafx.scene.control.TextField;

public class Constraints {          //constraints = limitações 
	
	/* Listener - vai controlar o comportamento do controller, função para ser executada quando o controller
	sofre alguma modificação ou interação com usuário  */
	
	//obs - referencia para o controller 
	//oldValue - valor do controller antes de mexer nele
	//newValue - depois que mexeu
	
	public static void setTextFieldInteger(TextField txt) {	
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) { //se num inteiro qlq qtd apenas de digito
				txt.setText(oldValue);
			}
		});
		
	}

	
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	
	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) { //se num com ponto flutuante - () opcional
				txt.setText(oldValue);
			}
		});
	}
}