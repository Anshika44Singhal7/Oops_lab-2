import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int x : arr) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
