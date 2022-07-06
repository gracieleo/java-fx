package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	// 1 - adicionar atributos do textfield e button
	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Button btnSum;

	@FXML
	private Label labelResult;

	@FXML
	public void onBtnSumAction() {

		try {
			// 1- transformar o que está na caixa (texto) para número (double)
			Locale.setDefault(Locale.US); // para garantir que vai pegar com ponto e não virgula do português
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			// 2- colocar o resultado (sum) dentro da label (labelResult)
			labelResult.setText(String.format("%.2f", sum));

		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
}
