public class SurfaceArea{
    static double bok1;
    static double bok2;
    static double pi = 3.14;
    
    public void info(){
        System.out.println("Circle surface: "+ pi*Math.pow(bok1, 2));
        System.out.println("Rectangle surface: "+bok1*bok2);
        System.out.println("Triangle surface: "+(Math.pow(bok1,2)*Math.sqrt(3))/4);
    }
    public static void main(String[] args){
        SurfaceArea surfaceArea1 = new SurfaceArea();
        surfaceArea1.bok1 = 5;
        surfaceArea1.bok2 = 10;
        
        SurfaceArea surfaceArea2 = new SurfaceArea();
        surfaceArea2.bok1 = 3;
        surfaceArea2.bok2 = 8;
    
        surfaceArea1.info();
        surfaceArea2.info();
    }
    
}