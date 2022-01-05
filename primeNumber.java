import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();

        for (int i = 2; i <= num-1; i++) {
            while(num % i == 0) {
                System.out.print("Not a prime number");
            if(num!=0)
        
                System.out.print("Yes, it is prime number");
            }
        }

    }

}
