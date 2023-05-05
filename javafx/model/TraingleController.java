import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TraingleController {

    private TriangleModel model;
    
    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button button;

    @FXML
    private TextArea textArea;

    @FXML
    void Handelbutton(ActionEvent event) {
    
    
    String aString = aTextField.getText();
    String bString = bTextField.getText();
    System.out.println(aString);
    double a = Double.parseDouble(aString);
    double b = Double.parseDouble(bString);
    model.AddResults(a,b);
    textArea.setText(model.toString());
   // double c = Math.sqrt(a * a + b * b);
    //textArea.setText(String.format("%.2f",c));

    }
    @FXML
    public void initialize()
    {
      model = new TriangleModel();
    }

}
