import java.util.Scanner;

public class Aaah{
    public static void main(String[] args) {
        char[] firstWord = {};
        char[] secondWord = {};
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            firstWord = sc.nextLine().toCharArray();
            secondWord = sc.nextLine().toCharArray();
        }
        sc.close();
        if(firstWord.length >= secondWord.length) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
