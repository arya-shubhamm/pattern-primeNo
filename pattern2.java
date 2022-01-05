import java.util.*;

public class pattern2 {
    public static void pattern02(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }

            nsp--;
            nst+=2;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern02(n);
    }

}
