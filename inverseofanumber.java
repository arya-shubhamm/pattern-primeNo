import java.util.*;

public class inverseofanumber {
    public static void inverseofnumber(int num) {
        while (num != 0) {
            int lastdigit = num % 10;
            num = num / 10;
            System.out.print(lastdigit);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a num");
        int number = scn.nextInt();
        inverseofnumber(number);
    }
}