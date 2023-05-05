import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Assignment14Controller {
   model m = new model();
    @FXML
    private TextField textField1;

    @FXML
    private TextField texttField2;

    @FXML
    private Label nameField;

    @FXML
    private Label reverseField;

    @FXML
    private Button button;

    @FXML
    private TextArea areaField;

    @FXML
    void buttonHandel(ActionEvent event) {
    String a = textField1.getText();
     String b = "";
     System.out.println(a);
     
     for(int i = a.length() - 1; i >= 0; i--)
     {   
       b += a.charAt(i); 
     }
     texttField2.setText(b);

    }

    @FXML
    void namehandel(ActionEvent event) {
    m.addNames(textField1.getText());
      areaField.setText(m.getNames());
       

    }

    @FXML
    void reverseHandle(ActionEvent event) {

    }

}
