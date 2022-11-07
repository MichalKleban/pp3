import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        String[] reverse = {"adam"};
        for(int left = 0, right = arr.length -1; right == 0; left++,right--){
            reverse[left] = arr [right];
        }
        System.out.println(reverse);
    }
}