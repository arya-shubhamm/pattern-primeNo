import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scn.nextInt();
        while (num > 0) {
            int dig = num % 10;
            num = num / 10;
            System.out.print(dig);

        }

    }

}
