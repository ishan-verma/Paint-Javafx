package FinalProject;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class BaseShape {
	private String color;
	private int x = 0;
	private int y = 0;
	private Shape shape;
	private Canvas canvas;
	
	public void setY(int y) {
		this.y = y;
	}
	
	/* constructor that takes parameter a shape - polygon, circle, rectangle and a canvas 
*/
	public BaseShape(Canvas canvas, Shape shape){
		this.shape = shape;
		this.canvas = canvas;
	}
	
	public Shape getShape() {
		return shape;
	}

	/**
	 * Gets the x coordinate on the board
	 * 
	 * @return the x
	 */
	
	/**
	 * Sets the x coordinate on the board
	 * 
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
