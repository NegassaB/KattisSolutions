import java.util.Scanner;

public class Coldputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noTemp = sc.nextInt();
        sc.nextLine();
        int counter = 0;
       while(noTemp > 0) {
            int x = sc.nextInt();
            if(x < 0) {
                counter++;
            }
            noTemp--;
        }
        sc.close();
        System.out.println(counter);
    }
}