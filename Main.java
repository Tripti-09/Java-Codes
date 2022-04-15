import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // it will take only a single string as input
        String name = sc.nextLine(); // take complete line as input
        // nextInt
        // nextFloat
        // nextDouble
        System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}