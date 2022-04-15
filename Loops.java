import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Hello World");
        }
        System.out.println();

        int i = 0;
        while(i<n) {
            i++;
            System.out.println("Hello World");
        }
        System.out.println();

        int j=0;
        do {
            System.out.println("Hello World");
            j++;
        } while(j<n);
    }
}