import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int k = sc.nextInt();

        System.out.println("Multiplication by 2^" + k + ": " + (n << k));
        System.out.println("Division by 2^" + k + ": " + (n >> k));
    }
}
