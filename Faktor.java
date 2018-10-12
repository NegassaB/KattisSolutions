import java.util.Scanner;
public class Faktor {
	public static void main(String[] args) {
	    int x = -1, y = -1;
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()) {
	        x = sc.nextInt();
	        y = sc.nextInt();
	    }
	    sc.close();
		System.out.println(Faktor.impFac(x, y));
	}
	
	static int impFac(int input1, int input2) {
		return input1 * (input2 - 1) + 1;
	}
}
