public class Student{
    //wykaz atrybutów
    
    String imie;
    int wiek;
    String idCard;
    boolean isValid;
    int semestrNr;
    double avarageGrade;
    
    //wykaz metod
    
    public void sayHello(){
        System.out.println("Hello");
    
    };
    public void displayName(){
        System.out.println("Moje imie to: "+ imie);
    
    };
    public void displayInfo(){
        System.out.println("Mój wiek to: "+ wiek);
        System.out.println("Numer semestru wynosi: "+ semestrNr);
        System.out.println("Srednia ocena wynosi: "+ avarageGrade);
        System.out.println("Status karty: "+isValid);

    };
    public void changeStatus(){
        if(isValid) isValid= false;
        else isValid = true;
    };
    public void displayAll(){
        System.out.println("Imie studenta: "+imie+" numer ID: "+idCard+" is Valid: "+isValid);
    };   
    public static void main(String[] args){
        Student s1 = new Student();
        s1.imie = "Janek";
        s1.wiek = 20;
        s1.isValid = true;
        s1.semestrNr = 3;
        s1.avarageGrade = 4.5;
        s1.idCard = "213132";
    
    s1.displayInfo();
    s1.changeStatus();
    s1.displayInfo();
    }
}