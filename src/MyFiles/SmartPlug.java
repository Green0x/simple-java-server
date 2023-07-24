package MyFiles;

public class SmartPlug {
    private int status;
    private String location;
    private int plugID;
    private int devices;

    public SmartPlug(String location, int status, int roomID) {
        this.status = status;
        this.location = location;
        this.plugID = roomID;
    }

    public int isStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPlugID() {
        return plugID;
    }

    public int getDevices() {
        return devices;
    }

    public void setDevices(int devices) {
        this.devices = devices;
    }

    private String booleanString(int value){
        if(value == 0) { return "No plugs connected";}
        if(value == 1) { return "off";}
        return "on";
    }

    private String deviceString(int value){
        if(value == 0) { return "N/A";}
        if(value == 1) { return "Lamp";}
        if(value == 2) { return "TV";}
        if(value == 3) { return "Computer";}
        if(value == 4) { return "Phone Recharger";}
        if(value == 5) { return "Heater";}
        return "N/A";
    }

    public String toOutput() {
        return "ID: " + plugID +
                " | location: " + location +
                " | status: " + booleanString(status) +
                " | Device: " + deviceString(devices) + "|" + "\n";
    }



}
