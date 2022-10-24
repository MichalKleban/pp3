public class punter{
    int liczba = 0;
    
    public void IncreaseBy1(){
        liczba+=1;
    }
    public void IncreaseBy10(){
        liczba+=10;
    }
    public void DecreaseBy1(){
        liczba-=1;
    }
    public void DecreaseBy10(){
        liczba-=10;
    }
    
    public void Reset(){
        liczba =0;
    }
    public void Show(){
        System.out.println(liczba);
    }
}