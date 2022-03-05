package sample;

public class Client_Table {
    String name;
    String IP;
    String number;
    String label;
    Client_Table(){
        this.name="";
        this.IP="";
        this.label="";
        this.number="";
    }
    Client_Table(String number,String name,String IP,String label){
        this.number=number;
        this.name=name;
        this.IP=IP;
        this.label=label;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
