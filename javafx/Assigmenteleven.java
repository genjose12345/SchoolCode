import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.layout.*;

public class Assigmenteleven extends Application
{
public void start(Stage stage)
{
   BorderPane root = new BorderPane();
   HBox hbox = new HBox();
   VBox vbox = new VBox();
   TextField tf = new TextField("TextField 1");
   TextField tf2 = new TextField("TextField 2");
   
   Button button = new Button();
   Button button2 = new Button();
   Button button3 = new Button();
   

   button.setText("Button 0");
   button2.setText("Button 1");
   button3.setText("Button 2");
   
   Label label = new Label("JavaFX Layouts");
   label.setAlignment(Pos.CENTER);
   
   vbox.getChildren().addAll(button,button2,button3);
   BorderPane.setAlignment(vbox,Pos.TOP_CENTER);
   hbox.getChildren().addAll(tf,tf2);
   BorderPane.setAlignment(hbox,Pos.TOP_CENTER);
   
   BorderPane.setAlignment(label,Pos.TOP_CENTER);
   hbox.setMaxWidth(450);
   
   
   root.setLeft(vbox);
   root.setCenter(hbox);
   root.setTop(label);
   
   
   
   Scene scene = new Scene(root,600,400);
   stage.setScene(scene);
   stage.setTitle("Assignment 11");
   stage.show();
   
}
} 

