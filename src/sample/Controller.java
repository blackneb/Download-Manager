package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.Clipboard;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Vector;

public class Controller {

    @FXML
    public TabPane trackerdownloader;

    @FXML
    public TableView tracktable;

    @FXML
    public TabPane serverclient;

    @FXML
    public TableView serverstable;

    @FXML
    public TableView clienttable;

    @FXML
    public TableView downloadertable;

    @FXML
    public TableColumn Trackerhostname;

    @FXML
    public TableColumn TrackerIP;

    @FXML
    public TableColumn Trackertype;

    @FXML
    public TableColumn serverhostname;

    @FXML
    public TableColumn clientname;

    @FXML
    public TableColumn label;

    @FXML
    public TableColumn no;

    @FXML
    public TableColumn downloadname;

    @FXML
    public TableColumn downloadprogress;

    @FXML
    public TableColumn downloadstatus;

    @FXML
    public TableColumn downloadsize;

    @FXML
    public TableColumn downloadadded;

    @FXML
    public TableColumn clientip;

    @FXML
    public TableColumn serverip;

    @FXML
    public Button serverremove;

    @FXML
    public Button clientremove;

    @FXML
    public Button trackerdelete;
    @FXML
    public AnchorPane downloadPane;

    @FXML
    public Tab downloadTab;
    @FXML
    public Button urldownload;

    @FXML
    public Button adddownload;

    @FXML
    public Button deletedownload;

    @FXML
    public Button canceldownload;

    @FXML
    public Button addserver;

    @FXML
    public Button deleteserver;

    @FXML
    public Button cancelserver;

    @FXML
    public TextField searchbox;

    @FXML
    public Button URLdownload;

    @FXML
    public Button searchbutton;

    @FXML
    public TextField URL;

    @FXML
    public AnchorPane downloaderpane;

    @FXML
    public Button startserver;

    @FXML
    public Button stopserver;

    @FXML
    public Button starttracker;

    @FXML
    public Button stoptracker;

    @FXML
    public Button pausedownload;

    @FXML
    public Button portconfiguration;

    @FXML
    public TableView serverdownloadertable;

    @FXML
    public TableColumn serverdownloadername;

    @FXML
    public TableColumn serverdownloaderprogress;

    @FXML
    public TableColumn serverdownloaderstatus;

    @FXML
    public TableColumn serverdownloadersize;

    @FXML
    public TableColumn serverdownloaderadded;

    @FXML
    public TableColumn serverdownloaderip;

    @FXML
    public Button sddelete;

    @FXML
    public Button sdstop;

    @FXML
    public Button sdpause;

    @FXML
    public void initialize(){

        boolean SERVER_STATE=false;
        boolean TRACKER_STATE=false;
        Vector name=new Vector();
        name.add("test");
        Trackerhostname.setCellValueFactory(new PropertyValueFactory("Trackerhostname"));
        TrackerIP.setCellValueFactory(new PropertyValueFactory("TrackerIP"));
        Trackertype.setCellValueFactory(new PropertyValueFactory("Trackertype"));

        serverhostname.setCellValueFactory(new PropertyValueFactory("name"));
        serverip.setCellValueFactory(new PropertyValueFactory("IP"));

        no.setCellValueFactory(new PropertyValueFactory("number"));
        clientname.setCellValueFactory(new PropertyValueFactory("name"));
        clientip.setCellValueFactory(new PropertyValueFactory("IP"));
        label.setCellValueFactory(new PropertyValueFactory("label"));

        downloadname.setCellValueFactory(new PropertyValueFactory("name"));
        downloadadded.setCellValueFactory(new PropertyValueFactory("added"));
        downloadprogress.setCellValueFactory(new PropertyValueFactory("progress"));
        downloadsize.setCellValueFactory(new PropertyValueFactory("size"));
        downloadstatus.setCellValueFactory(new PropertyValueFactory("status"));

        serverdownloadername.setCellValueFactory(new PropertyValueFactory<>("name"));
        serverdownloaderprogress.setCellValueFactory(new PropertyValueFactory<>("progress"));
        serverdownloaderstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        serverdownloaderadded.setCellValueFactory(new PropertyValueFactory<>("added"));
        serverdownloadersize.setCellValueFactory(new PropertyValueFactory<>("size"));
        serverdownloaderip.setCellValueFactory(new PropertyValueFactory<>("IP"));


    /*downloadPane.addEventFilter(KeyEvent.KEY_PRESSED,e->{
            if(e.isControlDown()&&KeyCode.V==e.getCode()&&!URL.isFocused()){
                Clipboard clipboard=Clipboard.getSystemClipboard();
                URL.setText(clipboard.getString());
                System.out.println(e.getCode());
            }
            }
    );
*/
        enter_items();

//        downloadPane.setOnKeyPressed(e->{
//            if(e.isControlDown()&&KeyCode.V==e.getCode()&&!URL.isFocused()){
//                Clipboard clipboard=Clipboard.getSystemClipboard();
//                URL.setText(clipboard.getString());
//
//            }//           System.out.println(e.getCode());
//        });

        downloaderpane.addEventFilter(KeyEvent.KEY_PRESSED,e->{
                    if(e.isControlDown()&&KeyCode.V==e.getCode()&&!URL.isFocused()){
                        Clipboard clipboard=Clipboard.getSystemClipboard();
                        URL.setText(clipboard.getString());
                        System.out.println(e.getCode());
                    }
                }
                );
        adddownload.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Add download");
            }
        });

        deletedownload.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                try{
                    int selected_name=downloadertable.getSelectionModel().getSelectedIndex();
                    downloadertable.getItems().remove(selected_name);
                    System.out.println("delete download");
                }
                catch (Exception e){
                    System.out.println("Please Select Item To Be Deleted");
                }
            }
        });

        canceldownload.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("cancel download");
            }
        });

        pausedownload.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Pause button");
            }
        });

        addserver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("add server");
            }
        });

        deleteserver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int selected_index=clienttable.getSelectionModel().getSelectedIndex();
                clienttable.getItems().remove(selected_index);
                System.out.println("delete server");
            }
        });

        URLdownload.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(URL.getText().toString());
            }
        });

        searchbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                downloadertable.getItems().clear();
                String tempo=searchbox.getText().toString();
                for(int i=0;i<name.size();i++){
                    if(tempo.equals(name.get(i))){
                        String tempname= (String) name.get(i);
                        downloadertable.getItems().addAll((adddownloaditems(tempname,5.6,"test","test","test")));
                    }
                }
                System.out.println(searchbox.getText().toString());
            }
        });

        startserver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                server_tracker_State sts=new server_tracker_State();
                sts.setServerState(true);
                System.out.println("Server State: " + sts.isServerState());
                startserver.setDisable(true);
                stopserver.setDisable(false);
            }
        });

        stopserver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                server_tracker_State sts=new server_tracker_State();
                sts.setServerState(false);
                System.out.println("Server State: " + sts.isServerState());
                stopserver.setDisable(true);
                startserver.setDisable(false);
            }
        });

        starttracker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                server_tracker_State sts=new server_tracker_State();
                sts.setTrackerState(true);
                System.out.println("Tracker State: " + sts.isTrackerState());
                starttracker.setDisable(true);
                stoptracker.setDisable(false);
            }
        });

        stoptracker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                server_tracker_State sts=new server_tracker_State();
                sts.setTrackerState(false);
                System.out.println("Tracker State: " + sts.isTrackerState());
                starttracker.setDisable(false);
                stoptracker.setDisable(true);
            }
        });

        sddelete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int index=serverdownloadertable.getSelectionModel().getSelectedIndex();
                serverdownloadertable.getItems().remove(index);
            }
        });
        sdstop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        sdpause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        portconfiguration.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    FXMLLoader fxml=new FXMLLoader(getClass().getResource("..\\UI\\portconfiguration.fxml"));
                    Parent root=(Parent) fxml.load();
                    Stage stage=new Stage();
                    stage.setTitle("Port Configuration");
                    stage.setScene(new Scene(root));
                    stage.show();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                System.out.println("popup configuration");
            }
        });
    }

    public void enter_items(){
        String counter;
        tracktable.getItems().addAll(additems("host","127.0.0.1","server"));
        serverstable.getItems().addAll(addserveritems("host", "127.0.0.1"));
        for(int i=1;i<=30;i++){
            counter=String.valueOf(i);
            clienttable.getItems().addAll(addclientitems(counter,"client","127.0.0.1","test"));
        }
        for(int i=1;i<=30;i++){
            counter=String.valueOf(i);
            downloadertable.getItems().addAll((adddownloaditems(counter,5.2,"test","test","test")));
        }
        for(int i=1;i<=30;i++){
            counter=String.valueOf(i);
            serverdownloadertable.getItems().addAll((addserverdownloaditems(counter,1.2,"test","test","test","127.0.0.1")));        }

    }
   public Tracker_Table additems(String Trackerhostname, String TrackerIP, String Trackertype){
       Tracker_Table tt=new Tracker_Table();
       tt.setTrackerhostname(Trackerhostname);
       tt.setTrackerIP(TrackerIP);
       tt.setTrackertype(Trackertype);
       return tt;
   }
    public Client_Table addclientitems(String number,String name,String IP,String label){
        Client_Table ct=new Client_Table();
        ct.setIP(IP);
        ct.setName(name);
        ct.setNumber(number);
        ct.setLabel(label);
        return ct;
    }
    public Server_Downloader_Table addserverdownloaditems(String name,Double progress,String status,String size,String added,String IP){
        Server_Downloader_Table sdt=new Server_Downloader_Table();
        sdt.setAdded(added);
        sdt.setIP(IP);
        sdt.setName(name);
        sdt.setProgress(progress);
        sdt.setStatus(status);
        sdt.setSize(size);
        return sdt;
    }

    public Server_Table addserveritems(String name, String IP){
        Server_Table st=new Server_Table();
        st.setIP(IP);
        st.setName(name);
        return st;
    }

    public Downloader_Table adddownloaditems(String name,Double progress,String status,String size,String added){
        Downloader_Table dt=new Downloader_Table();
        dt.setName(name);
        dt.setProgress(progress);
        dt.setAdded(added);
        dt.setSize(size);
        dt.setStatus(status);
        return dt;

    }

    public void clipboard_paste(KeyEvent e) {
        if(e.isControlDown()&&KeyCode.V==e.getCode()&&!URL.isFocused()){
            Clipboard clipboard=Clipboard.getSystemClipboard();
            URL.setText(clipboard.getString());
            System.out.println(e.getCode());
        }
    }
}
