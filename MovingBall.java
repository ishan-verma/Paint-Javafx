//By- Ishan Verma 
//due date - November 1, 2016 
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
// create main method 

public class MovingBall extends Application {
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//create a circle 
		Circle circle = new Circle();
		
				
		
		//set the circle width and height
		

		circle.setCenterX(200);
		circle.setCenterY(200);
		// set circle raduis
		circle.setRadius(10);
		circle.setStroke(Color.BLACK);
		circle.setFill(null);
		//create pane 
		Pane pane = new Pane();
		//add circle to the pane
		pane.getChildren().add(circle);
		
	
	//add pane to scene
		Scene scene1 = new Scene(pane, 400, 400);
		primaryStage.setTitle("Moving Ball with javaFX"); // Set the stage title
		primaryStage.setScene(scene1); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		circle.setOnKeyPressed(event ->{
			switch(event.getCode()){
			//add if and else statement for circle to not go past boundary 
			case DOWN: if((circle.getCenterY()+circle.getRadius() )<pane.getHeight()){circle.setCenterY(circle.getCenterY()+10);System.out.println("Down was pressed");} break;
			case UP: if(circle.getCenterY()>circle.getRadius() ){circle.setCenterY(circle.getCenterY()-10);System.out.println("Up was pressed");}break;
			case LEFT: if(circle.getCenterX()>circle.getRadius()){circle.setCenterX(circle.getCenterX()-10);System.out.println("Left was pressed");}break;
			case RIGHT: if((circle.getCenterX()+circle.getRadius())<pane.getWidth()){circle.setCenterX(circle.getCenterX()+10);System.out.println("Right was pressed");}break;
			
			//case RIGHT: ;break;
			default:;
			
				
			
			}
			
		});
		circle.requestFocus();
	}

}


