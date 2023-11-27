package Wallib;

public class ShapeMarker {

	Circle circle;
	Rectangle rectangle;
	Square square;
	
	

	public ShapeMarker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}

	public void drawCircle() {

		circle.draw();

	}

	public void drawRectangle() {

		rectangle.draw();

	}

	public void drawSquare() {

		square.draw();

	}
}
