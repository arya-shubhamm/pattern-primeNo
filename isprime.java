import java.util.*;

public class isprime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("is not prime");
            }
            else {
                System.out.println("is prime");
            }

        }
    }
}
