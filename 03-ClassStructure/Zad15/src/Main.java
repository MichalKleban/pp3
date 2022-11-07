public class Main {

    static int a(int x, int y){
        int sum = 0;
        for(int i =0; i<y-x; i++){
            sum+=1;
        }
        return sum;
    }
    static int b(int x, int y){
        int sum = 0;
        while (x!=y){
            sum+=x;
            x++;
        }
        return (sum);
    }

    static double c(int x, int y){
        return (b(x,y)/a(x,y));
    }
    public static void main(String[] args) {
        System.out.println(a(5,10));
        System.out.println(b(5,10));
        System.out.println(c(5,10));
            }
}