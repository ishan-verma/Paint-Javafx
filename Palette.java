
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * palette lets user select shape and color
 * @author AlexBeard
 *
 */
public class Palette extends VBox {
	
	
	private int height = 500;
	private int width = 100;
	
	
	public Palette(Canvas canvas) {
		super(22);
		this.setPrefHeight(height);
        this.setPrefWidth(width);                
        
	}
	

	


}
