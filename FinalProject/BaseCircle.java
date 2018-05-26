package FinalProject;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BaseCircle{

	private Circle circle;
	
//basecircle take parameter x&y coordinates to adds shape to canvas
	public BaseCircle(Canvas canvas, double x, double y) {
		//super(canvas, new Circle(20));
		circle = new Circle();
		circle.setRadius(40);
		circle.setCenterX(x);
		circle.setCenterY(y);
		// make the circle and adds to canvas
		canvas.getChildren().add(circle);
	
		
	}
	

	public void setFill(Color color) {
		circle.setFill(color);
		// TODO Auto-generated method stub
		
	}

	

	
	
	
	
}
