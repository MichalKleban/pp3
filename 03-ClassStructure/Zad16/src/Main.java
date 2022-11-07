import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        InternetDevice internetDevice1 = new InternetDevice("Smartphone");
        InternetDevice internetDevice2 = new InternetDevice("Laptop");
        InternetDevice internetDevice3 = new InternetDevice("Tablet");

        internetDevice1.connect();
        internetDevice2.connect();
        internetDevice3.connect();

        internetDevice1.displayStatus();
        internetDevice2.displayStatus();
        internetDevice3.displayStatus();
        internetDevice1.disconnect();
        internetDevice1.displayStatus();

        InternetDevice.displayConnection();
    }
    static class InternetDevice{
        String name;
        Boolean connected = false;
        static int connectedDevice;
        InternetDevice(String name){
            this.name = name;
        }
        void connect(){
            if(!this.connected) this.connected = true;
            InternetDevice.connectedDevice+=1;
        }
        void disconnect(){
            if(connected) connected = false;
            InternetDevice.connectedDevice-=1;
        }

        boolean isConnected(){
            return this.connected;
        }
        void displayStatus(){
            System.out.println("name : " + this.name);
            System.out.println("connection status : " + this.connected);
        }
        static void displayConnection(){
            System.out.println("Connected devices: "+ connectedDevice);
        }

    }
}