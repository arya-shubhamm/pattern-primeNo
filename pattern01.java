import java.util.*;

public class pattern01 {

    public static void pattern1(int n) {
        int nsp = n, nst = n;
        for (int r = 1; r <= nsp; r++) {
            for (int csp = 1; csp <= n; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= n; cst++) {
                System.out.print("*");

            }
            nsp += 0;
            nst += 0;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        pattern1(n);
    }
}


