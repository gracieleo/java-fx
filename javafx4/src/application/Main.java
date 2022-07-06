package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Aula 287 - APP soma

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//Parent é uma superclasse (a mais genérica para os componentes) como Anchor (que está no arquivo View.fxml)
			//Aqui carrega a tela
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene scene = new Scene(parent); //cria a cena 
			stage.setScene(scene); //carrega cena no palco
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
