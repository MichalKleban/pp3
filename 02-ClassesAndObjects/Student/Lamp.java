public class Lamp{
    
    boolean is_on = true;
    
    public void Switch_on(){
        is_on = true;
        System.out.println("Wlaczono lampe");
    }
    public void Switch_off(){
        is_on = false;
        System.out.println("Wylaczono lampe");    
    }
    public void Info(){
        if(is_on)  System.out.println("Lampe jest wlaczona" );
        else System.out.println("Lampe jest wylaczona" );
    }
}