package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Portconfiguration {

    @FXML
    public TextField trackerportfield;

    @FXML
    public Button trackerportsave;

    @FXML
    public TextField serverportfield;

    @FXML
    public Button serverportsave;
    @FXML
    public void initialize(){
        trackerportsave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(trackerportfield.getText().toString());
            }
        });

        serverportsave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(serverportfield.getText().toString());
            }
        });
    }
}
