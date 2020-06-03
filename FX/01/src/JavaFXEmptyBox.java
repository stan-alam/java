// javafx ex
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.application.*;
import javafx.scene.*;

public class JavaFXEmptyBox extends Application {

  public static void main(String[] args){

    System.out.println("Launch a JavaFX app!");

    //start the javafx app by calling the launch() method
    launch(args);
  }

//override the init() method
public void init() {
  System.out.println("within the init method...ok?"); //lets say you need your gui to do something here before startup
} //end init

//override the start() method
public void start(Stage myStage) {

  System.out.println("within the start method"); //anything else you may need to trigger within start

  //give the stage title
  myStage.setTitle("Just a JavaFX Skeleton");

  //creat a root node. in this case a flow layout is being used
  FlowPane rootNode = new FlowPane();

  //now create the scene on the stage
  Scene myScene = new Scene(rootNode, 300, 200);

  //set the scene on the stage
  myStage.setScene(myScene);

  //show the stage and its scene
  myStage.show();
 }
 //override the stop() method
 public void stop() {
   System.out.println("Within the stop method"); //Again, anything you need to clean up or stop. services etc.
 }
}
