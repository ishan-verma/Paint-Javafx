package FinalProject;

/*
import java.awt.MouseInfo;
import java.awt.Point
*/

import javafx.scene.paint.Color;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

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
 * The canvas on which shapes will be drawn.
 * 
 * @author
 *
 */
public class Canvas extends Pane {

	// increased the height and width to 1000

	private int width = 1000;
	private int height = 1000;

	/**
	 * creates a new canvas
	 * 
	 * @param
	 * @param node
	 */

	public Canvas() {
		this.setPrefHeight(height);
		this.setPrefWidth(width);

		
	}
	// this method moves single node, group node, strech's, allmost all the functions reguired :)
	
	public void movenode(ArrayList<Shape> selected) {
		// TODO Auto-generated method stub
		this.setOnKeyPressed(event -> {

			switch (event.getCode()) {
//use keys pressed value in swtich statement 
			case DOWN: {
				// arraylist use all the methods, so each element in arraylist uses methods by iterating through arraylist
				
				//IMPORTANT CHANGE:
				
			//I change colors of selected shapes using button R,G and B
				
				
				
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setTranslateY(selected.get(cnt).getTranslateY() + 10);
				System.out.println("Down was pressed");
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case UP: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setTranslateY(selected.get(cnt).getTranslateY() - 10);
				System.out.println("UP was pressed");
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case RIGHT: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setTranslateX(selected.get(cnt).getTranslateX() + 10);
				System.out.println("Right was pressed");
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case LEFT: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setTranslateX(selected.get(cnt).getTranslateX() - 10);
				System.out.println("Left was pressed");
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
				
			case D: {
				int cnt=0;
				while(cnt<selected.size()){	
					this.getChildren().remove(selected.get(cnt));
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case C: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setScaleX(selected.get(cnt).getScaleX() + .1);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case S: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setScaleY((selected.get(cnt).getScaleY()) + .1);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case Z: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setScaleX(selected.get(cnt).getScaleX() - .1);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case X: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setScaleY(selected.get(cnt).getScaleY() - .1);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case B: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setFill(Color.BLUE);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case R: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setFill(Color.RED);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
			case G: {
				int cnt=0;
				while(cnt<selected.size()){	
					selected.get(cnt).setFill(Color.GREEN);
				cnt++;
			}
			
			}
				this.requestFocus();
				break;
				
				
	
			default:
				;

			}
// this makes the arrow keys work on campus only
			event.consume();
		});

	}
}
