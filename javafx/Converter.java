import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.text.Text;

public class Converter extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label milesLabel = new Label("miles:  ");
      milesLabel.relocate(100,100);
      Label kmLabel = new Label("kms:   ");
      kmLabel.relocate(100,200);
      TextField milesField = new TextField();
      milesField.relocate(200,100);
      TextField kmsField = new TextField();
      kmsField.relocate(200,200);
      milesField.setOnAction(e-> kmsField.setText(convertMilesToKm(milesField.getText())));
      root.getChildren().addAll(milesLabel,kmLabel,milesField,kmsField);
      
      Scene scene = new Scene(root,400,300);
      stage.setScene(scene);
      stage.setTitle("converter");
      stage.show();
   }
   public String convertMilesToKm(String milesString)
   {
      double miles = Double.parseDouble(milesString); 
      double Km = 1.6 * miles;
      return "" + Km;
   }
}
