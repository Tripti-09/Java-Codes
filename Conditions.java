import java.util.Scanner;

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

        // switch without switch
        int button = sc.nextInt();
        
        if(button == 1) {
            System.out.println("Hello");
        } else if(button == 2) {
            System.out.println("Namaste");
        } else if(button == 3){
            System.out.println("Hallo");
        } else {
            System.out.println("Invalid button");
        }

        switch (variable)

        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Hallo");
            break;
            default : System.out.println("Invalid button");
            break;
        }
    }
}
