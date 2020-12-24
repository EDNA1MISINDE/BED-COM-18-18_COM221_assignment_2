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
import javafx.scene.shape.Line;

public class FeedCalculator extends Application{
    TextField calculate = new TextField();
    double maize = 0;
    double soya = 0;
    double groundnut = 0;
    double salt = 0;
    MaxFeed maxFeed = new MaxFeed();
         TextField maizeTF = new TextField();
        TextField soyaTF = new TextField();
        TextField groundnutTF = new TextField();
        TextField saltTF = new TextField();

        Button calculateBT = new Button("Calculate");

        

        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
     @Override
    public void start(Stage primaryStage){

       //pane.setRight(getVBox());
       

       // GridPane gridPane = new GridPane();

        //Pane pane = new Pane();

        maizeTF.setAlignment(Pos.BOTTOM_RIGHT);
        soyaTF.setAlignment(Pos.BOTTOM_RIGHT);
        groundnutTF.setAlignment(Pos.BOTTOM_RIGHT);
        saltTF.setAlignment(Pos.BOTTOM_RIGHT);

         VBox vBox = new VBox(2);
     //vBox.getChildren().addAll(maizeTF, soyaTF, groundnutTF, saltTF, calculateBT
     //label.setAlignment(Pos.BOTTOM_RIGHT);
     vBox.getChildren().addAll(new Label("Maize:"), maizeTF, new Label("Soya:"), soyaTF, new Label("Groundnut:"), groundnutTF, new Label("Salt:"), saltTF, calculateBT);

     vBox.setSpacing(5);
 //vBox.setAlignment(Pos.BOTTOM_RIGHT);
    vBox.setPadding(new Insets(5, 5, 5, 5));
    // Text text1 = new Text();
    // pane.getChildren().add(text1);
 
GridPane pane = new GridPane();

       pane.setAlignment(Pos.CENTER);
       pane.setHgap(5);
       pane.setVgap(5);
// pane.add(new Label("--------------------------------`--------------"),0,0);
pane.add(new Label("You will use (kg)"),0,1);
pane.add(label0, 0,2);
pane.add(label1,0,3);
pane.add(label2,0,4);
pane.add(label3,0,5);
pane.add(label4,0,6);

calculateBT.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
     maize = Double.parseDouble(maizeTF.getText());
     maxFeed.setMaize(maize);
 soya = Double.parseDouble(soyaTF.getText());
    maxFeed.setSoya(soya);
 groundnut = Double.parseDouble(groundnutTF.getText());
    maxFeed.setGroundnut(groundnut);
 salt = Double.parseDouble(saltTF.getText());
    maxFeed.setSalt(salt);
    //text1.setText("you will use:");
   /* feedMessage.setText("You will use" + " " + "(kg)");
    feedMessage.setText("Maize:" + 6/10 * maize);
    feedMessage.setText("Soya:" + 2/10 * soya);
    feedMessage.setText("Groundnut:" + 1.5/10 * groundnut);
    feedMessage.setText("Salt:" + 0.5/10 * salt);
*/
    
      label0.setText(String.format("Maize :  %.2f", maxFeed.getMaize()));
      label1.setText(String.format("Soya :  %.2f", maxFeed.getSoya()));
      label2.setText(String.format("Groundnuts :  %.2f", maxFeed.getGroundnut()));
      label3.setText(String.format("Salt :  %.2f", maxFeed.getSalt()));
      label4.setText(String.format("You will use %.2f", maxFeed.getSum()));    
        }
        });

        BorderPane pan = new BorderPane();
        pan.setTop(vBox);
        pan.setCenter(new Line(0, 0, 200, 0));
        pan.setBottom(pane);
     Scene scene = new Scene(pan);
            //setting the title
     primaryStage.setTitle("FeedCalculator"); 
     primaryStage.setResizable(false);
     //putting the scene in the stage
     primaryStage.setScene(scene); 
     primaryStage.show();    
    }
}

    