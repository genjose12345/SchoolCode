import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException; 

public class HelloName extends Application
{
   public void start(Stage stage)throws IOException
   {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("HEllowNameFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Hello Name");
      stage.show();
   }
   /*textArea.setText("Hello" + textField.getText() + "!" ); 
   names.add(textfield.getText());
   String string = "";
   for(String name : name)
   {
      String = String + "Hello" + name + "!/n";
   }
   
   */
}