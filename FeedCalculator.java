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
import javafx.scene.layout.BorderPane;
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

       /* Label maizeLB = new Label("Maize:");
        Label soyaLB = new Label("Soya:");
        Label groundnutLB = new Label("Groundnut:");
        Label saltLB = new Label("Salt:");*/

    public void start(Stage primaryStage){

       //pane.setRight(getVBox());

        GridPane gridPane = new GridPane();

        Pane pane = new Pane();
 //pane.setPadding(new Insets(5, 5, 5, 5));
 //Text text1 = new Text(20, 20, "Programming is fun");

        maizeTF.setAlignment(Pos.BOTTOM_RIGHT);
        soyaTF.setAlignment(Pos.BOTTOM_RIGHT);
        groundnutTF.setAlignment(Pos.BOTTOM_RIGHT);
        saltTF.setAlignment(Pos.BOTTOM_RIGHT);

       /* maizeLB.setAlignment(Pos.BOTTOM_LEFT);
        soyaLB.setAlignment(Pos.BOTTOM_LEFT);
        groundnutLB.setAlignment(Pos.BOTTOM_LEFT);
        saltLB.setAlignment(Pos.BOTTOM_LEFT);*/


        Label label = new Label();
         VBox vBox = new VBox(5);
     //vBox.getChildren().addAll(maizeTF, soyaTF, groundnutTF, saltTF, calculateBT);
     //vBox.getChildren().add(label);
     //label.setAlignment(Pos.BOTTOM_RIGHT);
     vBox.getChildren().addAll(new Label("Maize:"), maizeTF, new Label("Soya:"), soyaTF, new Label("Groundnut:"), groundnutTF, new Label("Salt:"), saltTF, calculateBT);
    // VBox getVBox(){
          //VBox vBox = new VBox(15);
 vBox.setSpacing(10);
 //vBox.setAlignment(Pos.BOTTOM_RIGHT);
 vBox.setPadding(new Insets(15, 5, 5, 5));
 //return vBox;
    // }

        Scene scene = new Scene(vBox);
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

    