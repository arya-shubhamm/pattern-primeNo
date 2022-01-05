
import java.util.*;

public class pattern02 {

    public static void pattern2(int n) {
        int nsp = (n - 1), nst = 1;
        for (int r = 1; r <= nsp; r++) {
            for (int csp = 1; csp <= n; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= n; cst++) {
                System.out.print("*");

            }
            nsp--;
            nst++;

        }
        System.out.println();
    }

}
