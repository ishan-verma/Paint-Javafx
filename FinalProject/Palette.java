package FinalProject;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 * palette lets user select shape and color
 * 
 * @author AlexBeard
 * 
 *
 */
public class Palette extends VBox {

	private String m = "d";
	private String color = "Red";
	private String shape = "Circle";
	private int height = 500;
	private int width = 100;
	private static int spacing = 100;
	private double x = 15;
	private double y = 15;

	
	ArrayList<Shape> selected;

	ArrayList<Shape> selected1;
	private Canvas canvas;

	public Palette(Canvas canvas) {
		super(spacing);
		this.canvas = canvas;
		/*this sets the height and width of canvas
		 * */
		this.setPrefHeight(height);
		this.setPrefWidth(width);

		/*creates button on palette
		 * */

		Button toggleButton1 = new Button("Circle");
		Button toggleButton2 = new Button("Rectangle");
		Button toggleButton3 = new Button("Triangle");
		Button toggleButton4 = new Button("Select");
		
		Button toggleButton6 = new Button("Red");
		Button toggleButton7 = new Button("Green");
		Button toggleButton8 = new Button("Blue");
		Button toggleButton9 = new Button("Group");
		Button toggleButton10 = new Button("UnGroup");
		VBox vbox = new VBox(toggleButton1, toggleButton2, toggleButton3, toggleButton4, toggleButton6,
				toggleButton7, toggleButton8, toggleButton9, toggleButton10);
		
		this.getChildren().add(vbox);
		/*toggleButton 6,7 and 8 setting shape color
		 * */
		toggleButton8.setOnMouseClicked(e -> clickMouse(toggleButton8));
		toggleButton7.setOnMouseClicked(e -> clickMouse(toggleButton7));
		toggleButton6.setOnMouseClicked(e -> clickMouse(toggleButton6));
		//toggle.Button10 to execute and clickMouseung() to ungroup all the shape
		toggleButton10.setOnMouseClicked(e -> clickMouseung());
		/*toggleButton 1,2 and 3 setting shape and executing drawing method 
		 * */
		toggleButton1.setOnMouseClicked(e -> clickMouseE(toggleButton1));
		toggleButton2.setOnMouseClicked(e -> clickMouseE(toggleButton2));
		toggleButton3.setOnMouseClicked(e -> {
			clickMouseE(toggleButton3);

		});
		
		
		/*
		 *to execute clicks on canvas after selecting shape 
		 */
		
		
		
		canvas.setOnMouseClicked(

				e -> {

					clickMouseS(color, shape, canvas, e.getX(), e.getY(), m);
				});
		//toggleButton9 does two function at the same time, selects the shape and make them into a composite shape
		
		toggleButton9.setOnMouseClicked(

				e -> {
					canvasClick(canvas);

					canvas.requestFocus();
				});

		toggleButton4.setOnMouseClicked(

				e -> {
					canvasClickSelect(canvas);

					canvas.requestFocus();
				});
	}
//ungroups all the shapes in composite grouped shape
	private void clickMouseung() {
		// TODO Auto-generated method stub
		selected.removeAll(selected);
	}

	

	public void clickMouse(Button b) {
		// whenever any color button is clicked the value of color is set equal
		// to that color.
		
		switch (b.getText()) {
		case "Green":

			color = "Green";

			break;
		case "Red":
			color = "Red";

			break;
		case "Blue":
			color = "Blue";

			break;

		}
		

	}
// this method sets the string value of shape to the selected shape
	
	public void clickMouseE(Button b2) {
		m = "d";
		switch (b2.getText()) {
		case "Circle":

			shape = "circle";

			break;
		case "Triangle":
			shape = "triangle";

			break;
		case "Rectangle":
			shape = "rectangle";

			break;

		}
		;
	}

	public void clickMouseS(String color, String shape, Canvas canvas, double x, double y,  String d) {
		// takes value of color and button clicked to create specific shape or
		// specified color.
		// for the coordinate points takes value from canvas.setOnMouseClicked
		// function x,y

		if (m == "d") {
			switch (shape) {
			case "circle":
/*
 * adds shape the canvas using string value of  shape and color selected
 * and get the value x and y coordinates
 * */
				if (color == "Red") {
					BaseCircle circle = new BaseCircle(canvas, x, y);
					circle.setFill(Color.RED);
				
					break;
					

				}
				if (color == "Green") {
					BaseCircle circle = new BaseCircle(canvas, x, y);
					circle.setFill(Color.GREEN);
					
					break;
				}
				if (color == "Blue") {
					BaseCircle circle = new BaseCircle(canvas, x, y);
					circle.setFill(Color.BLUE);
					
					break;
				}
				canvas.requestFocus();
				break;
			case "rectangle":
				if (color == "Red") {
					BaseRectangle r = new BaseRectangle(canvas, x, y);
					r.setFill(Color.RED);

					
					break;

				}
				if (color == "Green") {
					BaseRectangle r = new BaseRectangle(canvas, x, y);
					r.setFill(Color.GREEN);

					
					break;
				}
				if (color == "Blue") {
					BaseRectangle r = new BaseRectangle(canvas, x, y);
					r.setFill(Color.BLUE);

					break;
				}
				canvas.requestFocus();
				break;

			// create polygon with 3 points such that we can add equilateral
			// triangle.
			case "triangle":
				if (color == "Red") {

					BaseTri triangle = new BaseTri(canvas, x, y);
					triangle.setFill(Color.RED);

					
					break;

				}
				if (color == "Green") {

					BaseTri triangle = new BaseTri(canvas, x, y);
					triangle.setFill(Color.GREEN);

					break;

				}
				if (color == "Blue") {

					BaseTri triangle = new BaseTri(canvas, x, y);
					triangle.setFill(Color.BLUE);

					break;
				}
				canvas.requestFocus();
				break;

			}
		}
	}
// this method is to select the shapes on canvas
	public void canvasClickSelect(Canvas canvas) {
		// the value of m changes whenever select button is clicked. This disable the drawing method
		m = "s";
		// if(m=="s"){
		if (selected1 == null) {
			selected1 = new ArrayList<>();
		}
/*
 * my moving method moves the whole arraylist of shapes, so to move a single shape the arraylist of size one is created
 * */
		canvas.setOnMousePressed(f -> {
			// Shape node = (Shape) f.getPickResult().getIntersectedNode();
			Shape node = (Shape) f.getPickResult().getIntersectedNode();
		
			if (node != null) {

				selected1.removeAll(selected1);
				System.out.println(node);
				canvas.movenode(selected1);
				selected1.add(node);
				;
				System.out.println(selected1);

			}
			else if (selected.contains(node)) {

				System.out.println(node);
				// this is to move a group of shapes when a node present in group of shape is clicked
				canvas.movenode(selected);
				selected.add(node);
				;
				System.out.println(selected);
			}
		
	
			System.out.println("canvas");
		
			
		}
		);
		/*
		 * 
		 * try{
		 * code that might throw an exception
		 * } catch (Exception e){
		 * response you want
		 * }
*/
		canvas.requestFocus();
	}
	// }

	public void canvasClick(Canvas canvas) {
		
		m = "g";
		if (m == "g") {
			//list of shapes is created
			if (selected == null) {
				selected = new ArrayList<>();
			}

			canvas.setOnMousePressed(f -> {
				// Shape node = (Shape) f.getPickResult().getIntersectedNode();
				// to check is node is clicked
				Shape node = (Shape) f.getPickResult().getIntersectedNode();
				if (node != null) {
					System.out.println(node);
					canvas.movenode(selected);
					//adds the shapes to the list selected and movenode methods to move the whole list
					selected.add(node);
					
					System.out.println(selected);

				}
				
				
		
			}
			);
			canvas.requestFocus();
		}
	
}
	}
