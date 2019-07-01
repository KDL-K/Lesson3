import java.util.Scanner;
public class Task5_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number n: ");
        int n = in.nextInt();
        double result = 1;
        for (double i = 2; i <= n; i++) result += (1/i);
        System.out.println("Result: " + result);
        in.close();
    }
}