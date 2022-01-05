import java.util.*;

public class pattern06 {

    public static void pattern6(int n) { // hollow diamond
        if (n % 2 == 0) {
            n++;
        }
        int nsp = 1, nst = n / 2;
        for (int r = 1; r <= n; r++) {
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }

    }

    public static void pattern11(int n) {
        int nsp = n;
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(nst);
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }

    public static void diamond(int num) {
        int nst = 1;
        int nsp = num;
        for (int r = 1; r <= num; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");

            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
        }
        nst += 2;
        nsp--;
        System.out.println();
    }

    public static void pattern10(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                // ????
                if (r == c)
                    System.out.print("*");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
 public static void diad(int n){
     for(int i=1; i<=n; i++){
         for(int j=1;j<=n; j++){
             if(j==i){
                 System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }
         }
         System.out.println();
     }
 }
    public static void primeNo(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num / i == 0) {
                count++;
            }
            if (count == 2) {
                System.out.print("number is prime");
            } else {
                System.out.print(" not prime");
            }
        }
    }

    public static void countdigit(int num) {
        int dig = 0;
        while (num != 0) {
            num = num / 10;
            dig++;
        }
        System.out.print(dig);
    }

    public static void lcm(int num) {
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void areaOfcircle(int r) {
        double Area;
        double pi = 3.14;
        Area = (pi * r * r);
        System.out.print(Area);

    }

    public static void diamonddd(int num) {
        int nsp = num-1;
        int nst = 1;
        for (int i = 1; i <= num; i++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("*\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("\t");
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("*\t");}
            if(i<=num/2){
            nsp--;
            nst+=2;}
           else{
               nst-=2;
               nsp++;
           }
            System.out.println();
        }
    }

    public static void prime(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i != 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("no is prime");
        } else {
            System.out.println("no is not prime");
        }
    }

    public static void tableNo(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

    public static void pattern001(int num) {
        for (int i = num; i >= 1; i--) {
            for (int cst = 1; cst <= i; cst++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void pattern003(int n) {
        int nsp = 0;
        int nst = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("\t");

            }
            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void pattern1111(int n) {
        int nst = n;
        int nsp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            nst--;
            nsp++;
            System.out.println();
        }

    }

    public static void pattern005(int n) {
        int nst = 1;
        int nsp = (n / 2)+1;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {

                for (int j = 1; j <= nsp; j++) {
                    System.out.print("*\t");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("\t");
                }for (int j = 1; j <= nsp; j++) {
                    System.out.print("*\t");
                }
                nst = nst + 2;
                nsp--;
                System.out.println();
            } else {

                for (int j = 1; j <= nsp; j++) {
                    System.out.print("*\t");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("\t");
                }for (int j = 1; j <= nsp; j++) {
                    System.out.print("*\t");
                }
                nsp++;
                nst -= 2;
                System.out.println();
            }

        }
    }
 public static void diamondd(int n){
     int nsp = n/2; int nst=1;
     for(int i=1; i<=n; i++){
         if(i<=n/2){
         for(int j=1; j<=nsp; j++){
             System.out.print("\t");
         }for(int j=1;j<=nst; j++ ){
             System.out.print("*\t");

         }nsp--;
         nst+=2;
         System.out.println();
     }else{
         
         for(int j=1; j<=nst; j++){
             System.out.print("\t");
         }for(int j=1; j<=nsp; j++){
             System.out.print("*\t");

         }nst+=2;
         nsp--;
         System.out.println();
     }

     }

 }
    public static void pattern08(int n) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int n = sc.nextInt();

        pattern005(n);
    }

}
