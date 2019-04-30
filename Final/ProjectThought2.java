import javafx.application.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ProjectThought2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("example Gui");
		
		BorderPane componentLayout = new BorderPane();
		componentLayout.setPadding(new Insets(20,0,20,20));
		
		FlowPane choicePane = new FlowPane();
		choicePane.setHgap(100);
		Label choiceLbl = new Label("Fruits");
		ListView fruits = new ListView(FXCollections.observableArrayList("Apple", "Apricot", "Banana","Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"));
		choicePane.getChildren().add(choiceLbl);
		choicePane.getChildren().add(fruits);
		componentLayout.setTop(choicePane);
		
		FlowPane listPane = new FlowPane();
		listPane.setHgap(100);
		Label listLbl = new Label("Vegetables");
		ChoiceBox vegetables = new ChoiceBox(FXCollections.observableArrayList("Asparagus", "Beans", "Broccoli", "Cabbage", "Carrot", "Celery", "Cucumber", "Leek", "Mushroom", "Pepper", "Radish", "Shallot", "Spinach", "Swede", "Turnip"));
		listPane.getChildren().add(listLbl);
		listPane.getChildren().add(vegetables);
		listPane.setVisible(false);
		componentLayout.setCenter(listPane);
		Button vegFruitBut = new Button("Fruit or Veg");
		//@Override
		vegFruitBut.setOnAction(e -> change()); 
				
		componentLayout.setBottom(vegFruitBut);
		Scene appScene = new Scene(componentLayout,500,500); //Add the BorderPane to the Scene
		primaryStage.setScene(appScene); //Add the Scene to the Stage
		primaryStage.show();
	}
	public void change(ActionEvent event) {
		choicePane.setVisible(!choicePane.isVisible());
		listPane.setVisible(!listPane.isVisible());
	}

}