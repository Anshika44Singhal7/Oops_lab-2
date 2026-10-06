import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        boolean powerOf4 = n > 0;

        while (temp > 1) {
            if ((temp & 3) != 0) {
                powerOf4 = false;
                break;
            }
            temp = temp >> 2;
        }

        if (powerOf4)
            System.out.println("Number is a power of 4");
        else
            System.out.println("Number is not a power of 4");

        int toggled = n ^ (1 << 2);

        System.out.println("After toggling 3rd bit: " + toggled);
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {
            int result = toggled * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(toggled + " x " + i + " = " + result);
        }
    }
}
