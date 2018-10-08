import java.util.Scanner;

public class Solver{
    int in1 = 0, in2 = 0;
    public static void main(String[] args) {
        Solver solver = new Solver();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
         solver.in1 = sc.nextInt();
         solver.in2 = sc.nextInt();   
        }
        sc.close();
        System.out.println(Solver.solve(solver.in1, solver.in2));
        //Solver.solve(in1, in2);
    }
    
    private static int solve(int r1, int s) {
        return (2 * s) - r1;
    }
}
