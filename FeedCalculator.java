import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FeedCalculator extends Application{
    TextField calculate = new TextField();
    public void start(Stage primaryStage){

        TextField maizeTF = new TextField();
        TextField soyaTF = new TextField();
        TextField groundnutTF = new TextField();
        TextField saltTF = new TextField();

        Button calculateBT = new Button();

        //GridPane gridPane = new GridPane();

        Pane pane = new Pane();

        maizeTF.setAlignment(Pos.BOTTOM_RIGHT);
        soyaTF.setAlignment(Pos.BOTTOM_RIGHT);
        groundnutTF.setAlignment(Pos.BOTTOM_RIGHT);
        saltTF.setAlignment(Pos.BOTTOM_RIGHT);

        //GridPane.setHalignment(calculateBT, HPos.RIGHT);
    //pane.setAlignment(calculateBT, HPos.RIGHT);
        //btCalculate.setOnAction(e -> calculations());
        calculateBT.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
            calculate.setText("Calculate");
        }
        });

            Scene scene = new Scene(pane, 400, 250);
            //setting the title
     primaryStage.setTitle("FeedCalculator"); 
     primaryStage.setResizable(false);
     //putting the scene in the stage
     primaryStage.setScene(scene); 
     primaryStage.show();
        }
   /* private void calculations() {
        double maize =
    Double.parseDouble(maizeTF.getText());
    double soya =
    Double.parseDouble(soyaTF.getText());
    double groundnut =
    Double.parseDouble(groundnutTF.getText());*/

}

    