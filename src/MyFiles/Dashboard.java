package MyFiles;


public class Dashboard {


    public static void main(String[] args) {
        ConsoleHelper console = new ConsoleHelper();

        int roomNum = console.getInt("How many rooms are in the house: ");

        SmartHome house = new SmartHome(roomNum);     // Creates the rooms

        int plugNum = console.getInt("How many plugs are in the house: ");

        for (int i = 0; i < house.size(); i++){
            int status = 0;
            int roomID = i + 1;
            String location = console.getString("Enter name for room " + roomID);
            //house.updateObject(i, location);
            house.add(location, status, i);
        }

        for (int i = 0; i < plugNum; i++){

            for (int x = 0; x < house.size(); x++){
                System.out.print(house.displayRooms(x));
                System.out.print(" | ");
            }
            int roomID = console.getInt("\nSelect room to add plug too: ");
            console.listDevices();
            int deviceID = console.getInt("Select device to attach to plug");

            house.updateDevices(roomID, deviceID);
            house.updatePlugStatus(roomID, 1);
        }


        //house.updateObject(1); // Used to access a specific plug with roomID







        while(true){

            console.refreshDashboard();
            console.out(house.display());
            console.menuOptions();

            int input = console.getInt("Enter option: ");
            if(input == 1){
                console.out("HOUSE OPTIONS");
                console.out("1 - Switch all plugs off\n2 - Switch all plugs on");
                int houseInput = console.getInt("Enter option: ");

                if(houseInput == 2){
                    house.lightsOn();
                }
                if(houseInput == 1){
                    house.lightsOff();
                }
            }
            if(input == 2){
                console.out("ROOM OPTIONS");
                console.out("Select a room: ");
                for (int i = 0; i < house.size(); i++){
                    System.out.print(house.displayRooms(i));
                    System.out.print(" | ");
                }
                console.out("");
                console.getInt("Enter ID: ");

            }






        }


    }
}
