package sample;

public class Server_Table {
    String name;
    String IP;
    Server_Table(){
        this.name="";
        this.IP="";
    }
    Server_Table(String name,String IP){
        this.name=name;
        this.IP=IP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
}
