import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find whether even or odd
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // find largest
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than b.");
        } else if (a < b) {
            System.out.println(a + " is lesser than b.");
        } else {
            System.out.println(a + " is equal to b.");
        }
    }
}
