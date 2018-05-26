package FinalProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Paint extends Application {

	private Canvas canvas;
	private Palette palette;
	private Label rules;

	// nothing much in this class

	/**
	 * Launches the application.
	 *
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	/**
	 * Starts the application, setting up the canvas and palette and arranging
	 * them on the screen.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		canvas = new Canvas();

		canvas.setStyle("-fx-background-color: orange;-fx-border-color: black;");

		palette = new Palette(canvas);
		palette.setStyle("-fx-background-color: lightgreen;-fx-border-color: black;");

		rules = new Label();
		rules.setStyle("-fx-background-color: lightgreen;-fx-border-color: black;");
		rules.setPrefWidth(canvas.getPrefWidth() + palette.getPrefWidth());
		rules.setText("Press:\n" + "Ungroup: button to select multiple shapes and group\n"
				+ "Group: button to select shape \n" + "up, down, left and right arrow keys to move the shape \n"
				+ "z to shrink the current shape horizontally \n" + "c to grow the current shape horizontally \n"
				+ "s to grow the current shape vertically \n" + "x to shrink the current shape vertically \n"
				+ "DEL to delete the currently selected shape \n"
				+ "G to color shape Green, R to color shape Red and B to color shape Blue");

		// arrange palette buttons

		BorderPane rootPane = new BorderPane(canvas);
		// user will select shapes and different types of methods from palette
		rootPane.setLeft(palette);
		// canvas is where shapes will be drawn
		rootPane.setCenter(canvas);
		// rules will contains various print statements for user
		rootPane.setBottom(rules);

		// this adds all three
		Scene scene = new Scene(rootPane);

		primaryStage.setScene(scene);
		primaryStage.show();
		canvas.requestFocus();
	}

}