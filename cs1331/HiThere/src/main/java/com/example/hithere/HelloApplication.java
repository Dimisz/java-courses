package com.example.hithere;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
public void start(Stage mainStage){
    mainStage.setTitle("Hello world program");

    Button btn = new Button();
    btn.setText("Print melo world");
//    btn.setOnAction(new CustomEventHandler());

    //USING INNER CLASS
//    btn.setOnAction(new EventHandler<ActionEvent>(){
//        public void handle(ActionEvent event){
//            System.out.println("Goodbye world");
//        }
//    });

    //USING LAMBDA EXPRESSION
    btn.setOnAction((ActionEvent event) -> {
        System.out.println("Lambda world");
    });
    StackPane root = new StackPane();
    root.getChildren().add(btn);

    Scene scene = new Scene(root, 300, 300);
    mainStage.setScene(scene);
    mainStage.show();
}

//    private class CustomEventHandler implements EventHandler<ActionEvent> {
//        public void handle(ActionEvent event){
//            System.out.println("Hellow world");
//        }
//    }
}