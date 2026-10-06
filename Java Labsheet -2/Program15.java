import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while (temp != 0) {
            count += temp & 1;
            temp = temp >>> 1;
        }

        System.out.println("Number of set bits: " + count);
    }
} 
    

