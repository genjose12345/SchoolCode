import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimeNumberController {
    String out = "";
    
    @FXML
    private Button saveButton;

    @FXML
    private Button aGoButton;

    @FXML
    private TextField aTextField;

    @FXML
    private TextArea aTextArea;

    @FXML
    private TextField bTextField;

    @FXML
    void HandleGo(ActionEvent event) {
    
   int min = 0;
   int max = 0;
   try
   { 
     int flag = 0;
     String a = aTextField.getText();       
     String b = bTextField.getText();
          
     if(Integer.parseInt(a) > Integer.parseInt(b))
     {
       max = Integer.parseInt(a);
       min = Integer.parseInt(b);
     }
     else    
     {
       max = Integer.parseInt(b);
       min = Integer.parseInt(a);
     }
    
     for(int n = min; n <= max; n++)
     {
      for(int i = 2; i < n; i++)
      {
         if(n%i==0)
         {
            flag = 1;
            break;
         }
      }     
      if(flag ==0)
      {
         out += n + " ";
      }
      flag = 0;
      
     }
    }
    catch(RuntimeException e)
    {
    Alert a = new Alert(AlertType.WARNING, "Please enter a Integer");
    a.setTitle("FATAL ERROR!");
    a.setHeaderText("invalid input");
    a.show();
     }
     aTextArea.setText(out);

     out += "\n";  
 
    }

    @FXML
    void HandleSave(ActionEvent event) {

    }

    @FXML
    void HandleaTextField(ActionEvent event) {

    }

    @FXML
    void HandlebTextField(ActionEvent event) {

    }

}
