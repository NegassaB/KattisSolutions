import java.util.Scanner;

public class PhDHelper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		while (size-- > 0) {
			String line = sc.nextLine();
			if (line.contains("P=NP")) {
				System.out.println("skipped");
			} else {
				String[] strArray = line.split("\\+");
				System.out.println(Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]));
			}
		}
		sc.close();
	}
}