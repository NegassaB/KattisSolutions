import java.util.Scanner;
public class Quadrant {
	public static void main(String[] v) {
		int in1 = -1, in2 = -1;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			in1 = sc.nextInt();
			in2 = sc.nextInt();
		}
		sc.close();
		System.out.println(Quadrant.selector(in1, in2));
	}
	
	public static int selector(int input1, int input2) {
		int output = -1;
		if(input1 > 0 && input2 > 0) {
			output = 1;
		} else if(input1 < 0 && input2 < 0) {
			output = 3;
		} else if(input1 > 0 && input2 < 0) {
			output = 4;
		} else {
			output = 2;
		}
		return output;
	}
}