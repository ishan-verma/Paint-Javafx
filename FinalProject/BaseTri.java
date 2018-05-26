package FinalProject;


import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class BaseTri   {
private Polygon triangle;
	public BaseTri(Canvas canvas,double x, double y) {
		//super(canvas, new Polygon());
		 triangle = new Polygon();
		triangle.getPoints().addAll(new Double[] { x, y, x + 50, y - 100, x + 100, y });
		
		canvas.getChildren().add(triangle);
		//super(canvas, shape);
		// TODO Auto-generated constructor stub
	}
	public void setFill(Color color) {
		triangle.setFill(color);
		// TODO Auto-generated method stub
		
	}
	 

}
