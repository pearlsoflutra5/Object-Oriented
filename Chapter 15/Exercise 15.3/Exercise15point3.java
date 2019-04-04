/*
Kacie Rae
4-2-19
Exercise 15.3 moving a ball in a pane using buttons and action events.
*/

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;



 public class Exercise15point3 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		MovingCircle movingCircle = new MovingCircle(200, 200, 20);
		//MovingCircle movingCircle = new MovingCircle();
		
		Button leftBT = new Button("LEFT");
		leftBT.setOnAction(e -> movingCircle.moveLeft());
		Button rightBT = new Button("RIGHT");
		rightBT.setOnAction(e -> movingCircle.moveRight());
		Button upBT = new Button("UP");
		upBT.setOnAction(e -> movingCircle.moveUp());
		Button downBT = new Button("DOWN");
		downBT.setOnAction(e -> movingCircle.moveDown());
		
		HBox buttons = new HBox(leftBT, upBT, downBT, rightBT);
		buttons.setAlignment(Pos.BOTTOM_CENTER);
		buttons.setSpacing(10);
		buttons.setPadding(new Insets(10, 10, 10, 10));
				
		BorderPane pane = new BorderPane();
		pane.setCenter(movingCircle);
		pane.setBottom(buttons);

		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click to move the ball.");
		primaryStage.show();	
		
	}		
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}

class MovingCircle extends Pane {
	Circle circle;
	
	public MovingCircle() {
		this(15, 15, 10);
	}
	public MovingCircle(double centerX, double centerY, double radius) {
		circle = new Circle(centerX, centerY, radius);
		circle.setFill(Color.rgb(200,00,40));
		circle.setStroke(Color.rgb(255,60,100));
		getChildren().add(circle);
	}
	public void moveUp() {
		if (circle.getCenterY() - circle.getRadius()  - 10 < 0) return;
		circle.setCenterY(circle.getCenterY() - 10);
	}
	public void moveDown() {
		if (circle.getCenterY() + circle.getRadius() + 10 > getHeight()) return;
		circle.setCenterY(circle.getCenterY() + 10);
	}
	public void moveRight() {
		if (circle.getCenterX() + circle.getRadius() + 10 > getWidth()) return;
		circle.setCenterX(circle.getCenterX() + 10);
	}
	public void moveLeft() {
		if (circle.getCenterX() - circle.getRadius()  - 10 < 0) return;
		circle.setCenterX(circle.getCenterX() - 10);

	}

}








