package FinalProject;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BaseRectangle {
private Rectangle r1;
	public BaseRectangle(Canvas canvas, double x, double y) {
		//super(canvas,new Rectangle());
		r1 = new Rectangle();
		r1.setX(x);
		r1.setY(y);
		r1.setWidth(100);
		r1.setHeight(50);
		canvas.getChildren().add(r1);
		
		//super(canvas, shape);
		// TODO Auto-generated constructor stub
	}
	public void setFill(Color color) {
		r1.setFill(color);
		// TODO Auto-generated method stub
		
	}
	

}
