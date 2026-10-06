public class Program4 {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial visitors: " + visitors);
        System.out.println("Postfix increment: " + visitors++);
        System.out.println("After increment: " + visitors);
        System.out.println("Prefix increment: " + (++visitors));
        System.out.println("Final visitors: " + visitors);
    }
}
