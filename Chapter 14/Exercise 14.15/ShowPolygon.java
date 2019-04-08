/*
Kacie Rae
3-21-19
Exercise 14.15 Creating an octagon in JavaFx Interface.
*/
//used for everything
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//used for this shape
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.text.Text; 
import javafx.scene.text.Font;

//sometimes awt is built in with Button
import javax.xml.soap.*;
import java.awt.*;


public class ShowPolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyPolygon(), 400, 400);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
		
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

class MyPolygon extends Pane {
	private void paint() {
	Polygon polygon = new Polygon();
	polygon.setFill(Color.RED);
	polygon.setStroke(Color.WHITE);
	ObservableList<Double> list = polygon.getPoints();
			
	double centerX = getWidth() / 2, centerY = getHeight() / 2;
	double radius = Math.min(getWidth(), getHeight()) * 0.4;
			
	// s represents the number of sides of the shape. Make sure to update this number when necessary
	int s = 8;
	// Add points to the polygon list
	for (int i = 0; i < s; i++) {
		list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
		list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
	} 
	polygon.setRotate(22.5);
	Text text = new Text(70, 230, "STOP");
	text.setFont(Font.font(100));
	text.setFill(Color.WHITE);		
	getChildren().clear();
	getChildren().addAll(polygon, text);
}
			
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
			
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}		
}