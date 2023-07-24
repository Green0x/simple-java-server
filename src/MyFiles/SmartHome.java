package MyFiles;

public class SmartHome {
    private SmartPlug[] Plugs;
    public boolean stateChange;
    private int currentIndex;



    public SmartHome(int size) {
        Plugs = new SmartPlug[size];
        currentIndex = 0;

        stateChange = true;
    }

    public int size(){ return Plugs.length; }


    public void add(String location, int status, int roomID){
        if(currentIndex >= size()) { return;}
        SmartPlug object = new SmartPlug(location, status, roomID);
        Plugs[currentIndex] = object;
        currentIndex++;
    }



    public void updatePlugStatus(int value, int plugStatus){        // Select one object by id
        for(SmartPlug object : Plugs){
            if(object.getPlugID() == value) {
                object.setStatus(plugStatus);
                //System.out.println(object.getLocation());

            }
        }
    }

    public void updateDevices(int value, int device){        // Select one object by id
        for(SmartPlug object : Plugs){
            if(object.getPlugID() == value) {
                object.setDevices(device);
                //System.out.println(object.getLocation());

            }
        }
    }

    public void lightsOn(){
        for(SmartPlug object : Plugs){
            object.setStatus(2);
        }
    }

    public void lightsOff(){
        for(SmartPlug object : Plugs){
            object.setStatus(1);
        }
    }

    public String displayRooms(int value) {
        String test = "??";
        for (SmartPlug object : Plugs) {
            if (object.getPlugID() == value) {
                test = object.getLocation() + " ID: " + object.getPlugID();
                //System.out.println(object.getLocation());

            }
        }

        return test;
    }



    public String display(){
        String s = "";

        for(SmartPlug object : Plugs) {     // for each value in plugs

            s += object.toOutput() + " ";
        }




        return s;
    }



}
