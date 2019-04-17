/*
Kacie Rae
4-16-19
Exercise 16.21 Creating a countdown timer that infinitely plays music when it is done.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class Exercise16point21 extends Application {
	TextField number = new TextField();
	Media song = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mediaPlayer = new MediaPlayer(song);
	Timeline animation;
	
	@Override
	public void start(Stage primaryStage) {
		animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> run()));
		animation.setCycleCount(Timeline.INDEFINITE);
		
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setVolume(1);
		mediaPlayer.setRate(2);
		
		number.setAlignment(Pos.CENTER);
		number.setFont(Font.font(30));
		number.setPrefColumnCount(4);
		
		number.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER){
				animation.play();
			}
		});
		
		StackPane pane = new StackPane(number);
		Scene scene = new Scene(pane, 200 , 100);
		primaryStage.setTitle("Countdown Timer");		 
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		
	public void run() {
		if (Integer.parseInt(number.getText()) > 0) {
			mediaPlayer.pause();
			number.setText(String.valueOf(Integer.parseInt(number.getText()) - 1));
		}
		if (number.getText().equals("0")) {
			animation.pause();
			mediaPlayer.play();
		}
	}
	
	
}