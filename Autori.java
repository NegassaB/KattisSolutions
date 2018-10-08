import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autori.author(sc.nextLine());
        sc.close();
        /* if(args.length < 1) {
            System.err.println("no arguments provided");
            System.exit(1);
        }
        Autori.author(args[0]); */
    }

    public static void author(String input) {
        String[] temp = input.split("-");
        char[] tempChar = new char[temp.length];
        for(int i = 0; i < temp.length; i++) {
            String s = temp[i];
            if(Character.isUpperCase(s.charAt(0))) tempChar[i] = s.charAt(0);
            continue;
        }
        System.out.println(new String(tempChar));
    }
}