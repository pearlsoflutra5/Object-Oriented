/*
Kacie Rae
5-6-19
Final Project: Chaser game with an emoji face that eats food and dodges obstacles.

All the images are By Twitter, CC BY 4.0, https://commons.wikimedia.org/w/index.php?curid=(37288034 through 37288142)
*/
import java.util.Random;
import java.lang.String;
import javax.xml.soap.*;
import java.awt.*;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.layout.Region.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.Text; 
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.animation.*;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.Animation;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.plaf.basic.*;



public class FinalProjectChaserGame extends Application {
	public Chaser chaser;
	public Food food;
	public Text score;

	@Override 
		public void start(Stage primaryStage) {
			this.chaser = new Chaser();	
			this.food = new Food();		
			Pane gamePane = new Pane();
			gamePane.setPadding(new Insets(0, 10, 5, 10));
			gamePane.setStyle("-fx-border-color: blue");
			gamePane.getChildren().addAll(this.food, this.chaser);
			
			HBox hBox = new HBox(10);
			hBox.setAlignment(Pos.CENTER);
			hBox.setStyle("-fx-border-color: green");
			Button restart = new Button("Restart");
			this.score = new Text("0");
			hBox.getChildren().addAll(restart, this.score);	
	
			restart.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {
					chaser.restart();
				}
			});
			
			BorderPane pane = new BorderPane();
			pane.setCenter(gamePane);
			pane.setTop(hBox);
			pane.setOnKeyPressed(e ->  { 
			switch (e.getCode()) {
				case DOWN:this.chaser.down();return;  
				case UP: this.chaser.up(); break; 		
				case LEFT: this.chaser.left(); break; 
				case RIGHT: this.chaser.right(); break;
				}		
			});	

			Scene scene = new Scene(pane, 500, 500);
			primaryStage.setTitle("Chaser Game"); 
			primaryStage.setScene(scene); 
			primaryStage.show();
			pane.requestFocus();
			scene.addEventFilter(KeyEvent.ANY, keyEvent -> {
				pointGain();
			});
	}
	
	public void pointGain() {
			long mTime = System.currentTimeMillis();
			long end = mTime + 5000; 
			long scoreT = 0;
			if((chaser.face.getX() == food.food.getX()) && (chaser.face.getY() == food.food.getY())) {
				scoreT++;
				score.setText(Long.toString(scoreT));			
				food.die();
			}
			else {
				return;
			}	
	} 
	public static void main(String[] args) throws FileNotFoundException {
		launch(args);
	}
		
}
//--------------------------------CHASER-------------------------------------------------
class Chaser extends Pane {
	public ImageView face;
	public Chaser() {
		try {
			Image openFace = new Image(new FileInputStream("images/faces/openFace.png"));	
			this.face = new ImageView(openFace);
			this.face.setFitHeight(50);
			this.face.setFitWidth(50);
			getChildren().add(this.face);			
		} 
		catch (FileNotFoundException e) {
		}	
	}
	
	public void down(){
		if(this.face.getY() > 410) return;
		this.face.setY(this.face.getY() + 10);
	}
	public void up(){
		if(this.face.getY() < 10) return;
		this.face.setY(this.face.getY() - 10);
	}
	public void right(){
		if(this.face.getX() > 440) return;
		this.face.setX(this.face.getX() + 10);	
	}
	public void left(){
		if(this.face.getX() < 10) return;
		this.face.setX(this.face.getX() - 10);	
	}
	public void start(){
		try {
			Image openFace = new Image(new FileInputStream("images/faces/openFace.png"));	
			this.face = new ImageView(openFace);
			this.face.setFitHeight(50);
			this.face.setFitWidth(50);
			this.face.setX(0.0);
			this.face.setY(0.0);
			getChildren().add(this.face);		
		} 
		catch (FileNotFoundException e) {
		}		
	}
	public void restart(){
		getChildren().remove(this.face);
		start();			
	}	
	public void eat(){
		try{
			Image happyFace = new Image(new FileInputStream("images/faces/heartFace.png"));	
			this.face = new ImageView(happyFace);
			this.face.setFitHeight(50);
			this.face.setFitWidth(50);
		}
		catch(FileNotFoundException e){	
		}									
	}
	public void die(){
		try{
			Image deadFace = new Image(new FileInputStream("images/faces/deadFace.png"));
			this.face =	new ImageView(deadFace);
		}
		catch (FileNotFoundException e){	
		}		
	}
		
}
//--------------------------------FOOD-------------------------------------------------
class Food extends Pane {
	public ImageView food;
	public Food() {
			String foodImg = foodPicker();
			this.food = new ImageView(new Image(foodImg));
			int randFoodX = (int)(Math.random() * 300 + 50);
			int randFoodY = (int)(Math.random() * 390 + 50);
			if((randFoodX % 10.0 != 0) || (randFoodY % 10 != 0)){
				if(randFoodX % 10 != 0){
					while(randFoodX % 10 != 0){
						randFoodX--;
					}
						
				}
				if(randFoodY % 10 != 0){
					while(randFoodY % 10 != 0){
						randFoodY--;
					}
				}
			}
			this.food.setX(randFoodX);
			this.food.setY(randFoodY);
			this.food.setFitHeight(50);
			this.food.setFitWidth(50);
			getChildren().add(this.food);
	}
	public void start(){			
				String foodImg = foodPicker();
				this.food = new ImageView(new Image(foodImg));
				int randFoodX = (int)(Math.random() * 300 + 50);
				int randFoodY = (int)(Math.random() * 300 + 50);
				if((randFoodX % 10.0 != 0) || (randFoodY % 10 != 0)){
					if(randFoodX % 10 != 0){
						while(randFoodX % 10 != 0){
							randFoodX--;
						}			
					}
					if(randFoodY % 10 != 0){
						while(randFoodY % 10 != 0){
							randFoodY--;
						}
					}
				}
				this.food.setX(randFoodX);
				this.food.setY(randFoodY);
				this.food.setFitHeight(50);
				this.food.setFitWidth(50);
				getChildren().add(this.food);	
		}
	public void die(){
		getChildren().remove(this.food);
		start();
	}
	public static String foodPicker() {
		Random random = new Random();	
		String[] food  = {"banana", "birthdayCake", "bread", "candy", "cherry", "chocolate", "cookie", "corn", "donut", "drumstick", "flan", "frenchFries", "friedEgg", "fruitShiskabob", "grapes", "greenApple", "greenSoup", "hamburger", "honey", "icecreamBowl", "icecreamCone", "lemon", "lollypop", "meatOnBones", "meatShishkabob", "melon", "orange", "orangeJuice", "peach", "pear", "pineapple", "pizzaSlice", "redApple", "rice", "spaghetti","strawberry", "strawberryIcecream", "strawberryShortCake", "tomato", "watermelonSlice", "yams" };
		int rand = random.nextInt(food.length);
		String result = new String("images/" + food[rand] + ".png");
		return result;
	}
	
}

//--------------------------------OBJECTS-------------------------------------------------
class Objects extends Pane {
	
}


