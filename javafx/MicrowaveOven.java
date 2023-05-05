import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;

public class MicrowaveOven extends Application
{
   public void start(Stage stage)
   {
   BorderPane root = new BorderPane();
   
   Label label = new Label("Door");
   TextField tf = new TextField("00:00");
   tf.setMaxWidth(125);
   
   
   Button[] buttons = new Button[12];
   for(int i = 0 ; i < buttons.length ; i++)
   {
      buttons[i] = new Button(""+ (i + 1));
      buttons[i].setPrefSize(40,60);
   }
   buttons[9].setText("start");
   buttons[10].setText("0");
   buttons[11].setText("stop");
   
   root.setTop(tf);
   root.setCenter(label);
   BorderPane.setAlignment(tf,Pos.CENTER_RIGHT);
   
   TilePane tp = new TilePane();
   tp.setPrefWidth(125);
   for(int i = 0; i < buttons.length; i++)
   {
      tp.getChildren().add(buttons[i]);
   }
   root.setRight(tp);
   
   Scene scene = new Scene(root,500,300);
   stage.setScene(scene);
   stage.setTitle("microwave interface");
   stage.show();
   
   }
}