//Superclass
class Device{
    String deviceId;
    String status;

    //Constructor
    public Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    //Method to display device status
    public void displayStatus(){
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

//Subclass
class Thermostat extends Device{
    int temperatureSetting;

    //Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + " C");
        System.out.println("Device Type: Thermostat");
        System.out.println();
    }
}

//Main class
public class SmartHomeSystem{
    public static void main(String[] args){
        
        //creating a Thermostat object
        Thermostat thermostat1 = new Thermostat("TH001", "ON", 16);
        Thermostat thermostat2 = new Thermostat("TH002", "OFF", 14);

        //displaying thermostat details
        thermostat1.displayStatus();
        thermostat2.displayStatus();
    }
}