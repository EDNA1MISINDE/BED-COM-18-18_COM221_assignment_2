import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FeedCalculator extends Application{
    TextField calculate = new TextField();

         TextField maizeTF = new TextField();
        TextField soyaTF = new TextField();
        TextField groundnutTF = new TextField();
        TextField saltTF = new TextField();

        Button calculateBT = new Button("Calculate");

    public void start(Stage primaryStage){

       //pane.setRight(getVBox());

        //GridPane pane = new pane();

        Pane pane = new Pane();

        maizeTF.setAlignment(Pos.BOTTOM_RIGHT);
        soyaTF.setAlignment(Pos.BOTTOM_RIGHT);
        groundnutTF.setAlignment(Pos.BOTTOM_RIGHT);
        saltTF.setAlignment(Pos.BOTTOM_RIGHT);

        Scene scene = new Scene(pane, 200, 200);
            //setting the title
     primaryStage.setTitle("FeedCalculator"); 
     primaryStage.setResizable(false);
     //putting the scene in the stage
     primaryStage.setScene(scene); 
     primaryStage.show();

      calculateBT.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
            calculate.setText("Calculate");
        }
        });
    }
     VBox getVBox(){
        VBox vBox = new VBox();
 vBox.setSpacing(10);
 //vBox.setAlignment(Pos.BOTTOM_RIGHT);
 vBox.setPadding(new Insets(15, 5, 5, 5));
 vBox.getChildren().add(new Label("Maize:"));
 vBox.getChildren().add(maizeTF);
 return vBox;
    } 


// vBox.getChildren().addAll(maizeTF, soyaTF, groundnutTF, saltTF, calculateBT);
 //vBox.add(new Label("Maize:"));
 //vBox.getChildren().add(maizeTF);

 
 
        /*pane.setHgap(5);
        pane.setVgap(5);*/


        //pane.setHalignment(calculateBT, HPos.RIGHT);
    //pane.setAlignment(calculateBT, HPos.RIGHT);
        //btCalculate.setOnAction(e -> calculations());
       

            
   /* private void calculations() {
        double maize =
    Double.parseDouble(maizeTF.getText());
    double soya =
    Double.parseDouble(soyaTF.getText());
    double groundnut =
    Double.parseDouble(groundnutTF.getText());*/
     

}

    