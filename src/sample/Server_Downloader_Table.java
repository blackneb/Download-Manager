package sample;

public class Server_Downloader_Table {
    String name;
    Double progress;
    String status;
    String size;
    String added;
    String IP;
    Server_Downloader_Table(){
        this.name="";
        this.progress=0.0;
        this.status="";
        this.size="";
        this.added="";
        this.IP="";
    }
    Server_Downloader_Table(String name,Double progress,String status,String size,String added,String IP){
        this.name=name;
        this.progress=progress;
        this.status=status;
        this.size=size;
        this.added=added;
        this.IP=IP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
}
