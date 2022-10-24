public class Book{

String nazwa;
int cena;
String data_wydania;
int ilosc_stron;
String autor;
boolean czy_dostepna;


    public void info(){
        System.out.println("Title is: "+nazwa+" written by: "+autor+" in: "+data_wydania+"oraz kosztuje: "+cena);
        
    }
    public void price(){
        System.out.println(cena);
    }
    public void dostpenosc(){
        if (czy_dostepna) System.out.println("Book is avaliable");
        else System.out.println("Book is unavaliable");
    }
    public void wypozycz(){
        if (czy_dostepna)  czy_dostepna = false;
        else czy_dostepna = true;
    }
    public void dlugosc(){
        if(ilosc_stron>=500) System.out.println("Dluga");
        else if (ilosc_stron>=250) System.out.println("Srendia");
        else System.out.println("Krotka");
    }
}