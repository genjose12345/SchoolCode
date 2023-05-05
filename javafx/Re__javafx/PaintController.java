import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.*;
import javafx.scene.*;
import java.io.*;

public class PaintController {

  //  private Color currentColor;
    private GraphicsContext graphicsContext;
    private PaintModel model;    
    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonLoad;

    @FXML
    private Button buttonSave;
    
    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker colorPicker;
    
    @FXML
    void handelClear(ActionEvent event) {
      model.clearRectangles();
      graphicsContext.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
    }

    @FXML
    void handelLoad(ActionEvent event) {

    }

    @FXML
    void handelSave(ActionEvent event)throws IOException {
      FileChooser fc = new FileChooser();
      Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
      File selectedFile = fc.showSaveDialog(stage);
      FileOutputStream fos = new FileOutputStream(selectedFile);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

    }

    @FXML
    void handleColorPicker(ActionEvent event) {
        model.setColor(colorPicker.getValue().toString());
        //System.out.println(currentColor);  
    }
    
    @FXML
    void handleMouseDragged(MouseEvent event) {
        //System.out.println("mouise dragged");
        graphicsContext.setFill(Color.valueOf(model.getColor()));
        graphicsContext.fillRect(event.getX(), event.getY(), 4, 4);
        model.add(new Rectangle(event.getX(),event.getY(),model.getColor()));
    }
    
    @FXML
    public void initialize()
    {
        model = new PaintModel(Color.WHITE.toString());
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.WHITE);
    }
    

}