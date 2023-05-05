import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.text.Text;

public class MoveText extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      HBox hbox = new HBox();
      root.setBottom(hbox);
      Button left = new Button("left");
      
      Button right = new Button("right");
      hbox.getChildren().addAll(left,right);
      hbox.setPrefWidth(200);
      hbox.setAlignment(Pos.CENTER);
      hbox.setSpacing(10);
      Pane pane = new Pane();
      root.setCenter(pane);
      root.setBottom(hbox);
      Text text = new Text("whatever");
      pane.getChildren().add(text);
      text.relocate(150,100);     
      left.setOnAction(e -> text.setX(text.getX() - 5));
      right.setOnAction(e-> text.setX(text.getX() + 5));
      Scene scene = new Scene(root,400,250);
      stage.setScene(scene);
      stage.setTitle("moveText");
      stage.show();
   }
   public void moveLeft()
   {
      
   }
   public void moveRight()
   {
      System.out.println("right");
   }
}