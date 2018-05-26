

import javafx.scene.layout.Pane;

/**
 * The canvas on which shapes will be drawn.
 * @author 
 *
 */
public class Canvas extends Pane {


	private int width = 500;
	private int height = 500;

	/**
	 * creates a new canvas
	 */
	public Canvas() {
		this.setPrefHeight(height);
		this.setPrefWidth(width);

		setUpKeyPresses();


	}


	/**
	 * Set up key pressed events. Fill in the key handler to manipulate the shapes on the screen.
	 */
	private void setUpKeyPresses() {

		this.setOnKeyPressed(e -> {
			System.out.println("Key was pressed");
			e.consume(); // avoid side effects from the key press, like changing the focus with arrow keys

		});
		System.out.println("Keys set up");
	}

}
