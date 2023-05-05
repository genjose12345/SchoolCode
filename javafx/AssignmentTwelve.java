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
import javafx.event.ActionEvent;


public class AssignmentTwelve extends Application
{
   TextField tf;
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      Pane root2 = new Pane();
      
      tf = new TextField();
      TextField tf2 = new TextField();
      
      HBox hbox = new HBox();
      HBox hbox2 = new HBox();            
    
      Label label = new Label("Text");
      Label label2 = new Label("Acronym");
      
      hbox.getChildren().addAll(label,tf);
      hbox2.getChildren().addAll(label2,tf2); 
             
    
     root.setCenter(root2);
     root2.getChildren().addAll(hbox,hbox2);
             
      hbox.relocate(150,100);
      hbox2.relocate(150,200);  

      hbox.setSpacing(65);
      hbox2.setSpacing(40);
      
      
      tf.setOnAction(e -> tf2.setText(FirstLetter(tf.getText())));
      
      Scene scene = new Scene(root,600,400);
      stage.setTitle("Assignment12");
      stage.setScene(scene);
      stage.show();
   }
    public String FirstLetter(String word)
   {
      String letter = "";
      String words[] = word.split(" ");
      
      
      for(int i = 0; i < words.length; i++)
      {
         letter = letter + words[i].charAt(0);
      }
      return letter;
   }
}