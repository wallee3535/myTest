package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DesignFX extends Application {

	Label lb_text;
	Button btn_click;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		lb_text = new Label("some text");
		btn_click = new Button("Click it");

		btn_click.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				lb_text.setText("New Text");

			}

		});
		VBox root = new VBox();
		//root.getChildren().add(lb_text);
		root.getChildren().addAll(lb_text, btn_click);
		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);
		stage.show();

	}
}
