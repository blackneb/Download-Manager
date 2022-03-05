package sample;

public class server_tracker_State {
    static boolean SERVER_STATE=false;
    static boolean TRACKER_STATE=false;
    public static boolean isServerState() {
        return SERVER_STATE;
    }

    public static void setServerState(boolean serverState) {
        SERVER_STATE = serverState;
    }

    public static boolean isTrackerState() {
        return TRACKER_STATE;
    }

    public static void setTrackerState(boolean trackerState) {
        TRACKER_STATE = trackerState;
    }
}
