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


public class AssigmentTen extends Application
{
   public void start(Stage stage)
   {
   BorderPane root = new BorderPane();
   VBox vbox = new VBox();
   
   Label label = new Label("Enter Some Text:");
   //root.setTop(label);
  
   BorderPane.setAlignment(label,Pos.CENTER);
   TextField tf = new TextField();
   Button button = new Button("Click me");
  // root.setCenter(tf);
   tf.setMaxWidth(125);
   //root.setBottom(button);
   BorderPane.setAlignment(button,Pos.CENTER);
   
   vbox.getChildren().addAll(label,tf,button);
   root.setCenter(vbox);
    vbox.setAlignment(Pos.CENTER);
    vbox.setSpacing(40);

   
   Scene scene = new Scene(root,600,400);
   stage.setScene(scene);
   stage.setTitle("AssigmentTen");
   stage.show();
   }
}