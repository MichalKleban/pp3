    public class CinemaTicket {
    static String cinemaName = "Cinema City";
    String filmTitle;
    String row;
    String seat;
    double price;
    
    public void showData(){
        System.out.println("Cinema Name: "+ cinemaName+ "film title: "+filmTitle+" row: "+row+" seat: "+seat+" price: "+ price);
    }
    
    public CinemaTicket(String r,String s, String t){
        filmTitle = t;
        row = r;
        seat = s;
        if (Integer.parseInt(row) <=2) price = 10;
        else price = 25;
    }
    
    
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("12","22","Gladiator");
    
        CinemaTicket t2 = new CinemaTicket("26","2", "Top Gun");
        
    
        t1.showData();
        t2.showData();
    }



}