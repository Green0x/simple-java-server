package MyFiles;

import java.util.Scanner;

public class ConsoleHelper{


    public void out(String prompt) {
        System.out.println(prompt);
    }

    public int getInt(String prompt) {
        Scanner in = new Scanner(System.in);
        out(prompt);
        return in.nextInt();
    }

    public String getString(String prompt){
        Scanner in = new Scanner(System.in);
        out(prompt);
        return in.nextLine();
    }

    public boolean getBool(String prompt){
        Scanner in = new Scanner(System.in);
        out(prompt);
        return in.nextBoolean();
    }

    public void refreshDashboard(){
        out("-------------DASHBOARD----------------");


    }
    public void menuOptions(){
        out("-------------MENU OPTIONS-------------");
        out("1 - house level options\n2 - room level options\n3 - plug level options\n4 - system options");
    }

    public void listDevices(){
        out("1-Lamp\n" +
                "2-TV\n" +
                "3-Computer\n" +
                "4-Phone Recharger\n" +
                "5-Heater\n");
    }
}
