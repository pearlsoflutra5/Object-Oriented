//import javafx for button, stage, scene, and event handler

 
//import javafx.*;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

import javafx.scene.shape.Polygon;
import javax.xml.soap.*;
import javafx.collections.ObservableList;




public class exEvent extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("OK");
		BtnHandler handler = new BtnHandler();
		btn.setOnAction(handler);
		
		//or btn.setOnAction(new btnHandler());
		
		Scene scene = new Scene( btn, 200,200);
		primaryStage.setTitle("Event Example");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}		
/*to add an event handler, 2 things msut happen:
	1) the object must be an instance of EventHandler<T extends Event> interface
		1a) must have void method called handle
	2) The EventHandler must be registered with the event source object using source.setOnAction(handler)
*/
class BtnHandler implements EventHandler<ActionEvent> { //buttons will always be this
	int count = 0;
	
	@Override 
	public void handle(ActionEvent e){
		count++;
		System.out.println("Button clicked " + count + " times");
	}
}

