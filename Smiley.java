import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Smiley extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();

		Line line = new Line();
		line.setStartX(100);
		line.setStartY(100);
		line.setEndX(100.0f);
		line.setEndY(110.0f);
		
		Arc arc = new Arc();
		arc.setCenterX(100);
		arc.setCenterY(120);
		arc.setRadiusX(20);
		arc.setRadiusY(5);
		arc.setStartAngle(0);
		arc.setLength(-180);

		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(null);
		circle1.setCenterX(90);
		circle1.setCenterY(90);
		circle1.setRadius(5);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(null);
		circle2.setCenterX(110);
		circle2.setCenterY(90);
		circle2.setRadius(5);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(null);

		Pane pane = new Pane();
		pane.getChildren().add(circle);
		pane.getChildren().add(circle1);
		pane.getChildren().add(circle2);
		pane.getChildren().add(arc);
		pane.getChildren().add(line);
		// fill in red, green, blue and opacity with doubles
		// between 0.0 and 1.0
		// Button btOK = new Button("OK");
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
