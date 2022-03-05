package sample;

public class Tracker_Table {
    String Trackerhostname;
    String TrackerIP;
    String Trackertype;
    Tracker_Table(){
        this.Trackerhostname="";
        this.TrackerIP="";
        this.Trackertype="";
    }
    Tracker_Table(String Trackerhostname, String TrackerIP, String Trackertype){
        this.Trackerhostname=Trackerhostname;
        this.TrackerIP=TrackerIP;
        this.Trackertype=Trackertype;
    }

    public String getTrackerhostname() {
        return Trackerhostname;
    }

    public void setTrackerhostname(String trackerhostname) {
        Trackerhostname = trackerhostname;
    }

    public String getTrackerIP() {
        return TrackerIP;
    }

    public void setTrackerIP(String trackerIP) {
        TrackerIP = trackerIP;
    }

    public String getTrackertype() {
        return Trackertype;
    }

    public void setTrackertype(String trackertype) {
        Trackertype = trackertype;
    }
}
