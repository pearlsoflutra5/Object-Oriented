/*
Kacie Rae
4-4-19
Exercise 15.Animation rectangle moving along perimeter of pentagon and changing opacity, pauses come from mouse click.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.text.Text; 
import javafx.scene.text.Font;
import javax.xml.soap.*;
import java.awt.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import javafx.util.Duration;
import javafx.scene.input.MouseButton;
import javafx.animation.PathTransition;
import javafx.fxml.FXMLLoader;
import javafx.animation.*;
import javafx.animation.FadeTransition;

public class Exercise15Animation extends Application {
	@Override
	public void start(Stage primaryStage) {   
		
		Scene scene = new Scene(new MovingRectangle
		(), 400, 400);
		primaryStage.setTitle("Click to start the rectangle."); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
			
	public static void main(String[] args) {
		launch(args);
	}
}

class MovingRectangle extends Pane {		
	
	private void paint() {
		//create polygon
		Polygon polygon = new Polygon();
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
				
		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		int s = 5;
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		} 
		polygon.setRotate(54);
		//create rectangle
		Rectangle rectangle = new Rectangle (list.get(0) - 80,list.get(1) + 108, 40, 20);
		rectangle.setFill(Color.rgb(255, 51, 153));
		
		//create path
		PathTransition path = new PathTransition(Duration.millis(4000), polygon, rectangle);	
		path.setCycleCount(PathTransition.INDEFINITE);
		
		//create fade
		FadeTransition fade = new FadeTransition(Duration.millis(2000), rectangle);
		fade.setFromValue(1.0);
		fade.setToValue(0.1);
		fade.setCycleCount(Timeline.INDEFINITE);
		fade.setAutoReverse(true);
		
		FadeTransition fadeP = new FadeTransition(Duration.millis(2000), polygon);
		fadeP.setFromValue(0.2);
		fadeP.setToValue(1.0);
		fadeP.setCycleCount(Timeline.INDEFINITE);
		fadeP.setAutoReverse(true);
		
		getChildren().clear();
		getChildren().addAll(polygon, rectangle);
		
		setOnMouseClicked(e-> {
			if (e.getButton() == MouseButton.PRIMARY) {
				path.play();
				fade.play();
				fadeP.play();
			} else if (e.getButton() == MouseButton.SECONDARY) {
				path.pause();
				fade.pause();
				fadeP.pause();
			}
		});

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