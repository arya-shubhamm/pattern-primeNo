import java.util.Scanner;

public class function {
    public static void printName() {
        System.out.println("Hello");

    }

    public static void greeting(int name) {
        System.out.print(name + " hello coder , how are you ?");
    }

    public static void pattern1(int n) {
        int nsp = n, nst = n;
        for (int r = 1; r <= nsp; r++) {
            for (int csp = 1; csp <= n; csp++) {
                System.out.print("-");
            }

            for (int cst = 1; cst <= n; cst++) {
                System.out.print("*");

            }
            nsp += 0;
            nst += 0;
            System.out.println();
        }

    }

    public static void reverseaNumber(int num) {
        for (int i = 0; i <= num; i++) {
            while (num > 0) {
                int dig = num % 10;
                num = num / 10;
                System.out.print(dig);
            }
        }
    }

    public static void evenorOdd(int num) {
        if (num % 2 == 0) {
            System.out.print(num + "  is even");
        } else {
            System.out.print(num + " is odd number");
        }
    }

    public static int countofNumber(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;

        }
        return count;
    }

    public static void primeFactor(int num) {
        for (int pn = 2; pn * pn <= num; pn++) {
            while (num % pn == 0) {
                num = num / pn;
                System.out.print(pn + " ");
            }
        }
        if (num != 0) {
            System.out.print(num);
        }
    }

    public static int rotateNumber(int num, int r) {

        int len = countofNumber(num);
        int a = num / (int) Math.pow(10, r);
        int b = num % (int) Math.pow(10, r);
        System.out.println(a + "," + b);
        return (b * (int) Math.pow(10, len - r) + a);
    }

    public static int occurence(int num, int d) {
        int occur = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem == d)
                ;
            occur++;

        }
        return occur;
    }

    public static void pattern03(int n) {
        int nst = 1;
        int nsp = (n - 1);
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");

            }
            // for(int csp=1)
        }

    }

    public static void pattern2(int n) {
        int nsp = (n - 1), nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");

            }
            nsp--;
            nst++;// nst = nst+2
            System.out.println();
        }

    }

    public static void tableofNumber(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);

        }
    }

    public static void Range(int a, int b) {
        for (int i = a; i <= b; i++) {
            tableofNumber(i);
            System.out.println("------");
        }

    }

    public static void primeNumber(int num) {
        for (int i = 2; i <= num; i++) {
            while (num / i == 0) {
                System.out.print(i + " ");

            }
            if (num != 0) {
                System.out.print(num);
            }
        }
    }

    public static int sumofTwonum(int a, int b) {

        return (a + b);
    }

    public static void simpleInterest(int p, int r, int t) {
        float simpleinterest = (p * t * r) / 100F;
        System.out.print("simpleinterest is :" + simpleinterest);
    }

    public static void plusminusmulti(int a, int b) {
        int c = a + b;
        int d = a * b;
        int e = a / b;
        int f = a - b;
        System.out.println("addition of two number is " + c);
        System.out.println("multiply of two number is " + d);
        System.out.println("divide of two number is " + e);
        System.out.println("substraction of two number is " + f);
    }

    public static void greater(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");

        } else {
            System.out.println(b + " is greater");
        }
    }

    public static void currency(int a) {
        float b = (a * 0.13F);
        System.out.print(" usd currency is " + b);
    }
    // public static void pattern08(int row){
    // for(int r=1; r)

    public static void shubham(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 10 == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(" num is prime");
        } else {
            System.out.println("number is not prime");
        }
    }

    public static int decimalTobinary(int num) {
        int ans = 0, pow = 1;
        while (num != 0) {
            int rem = num % 2;
            num = num / 2;
            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int binaryTodecimal(int num) {
        int ans = 0, pow = 1;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            ans += rem * pow;
            pow = pow * 2;
        }
        return ans;
    }

    public static int anybaseTodecimal(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % 10;
            n /= n / 10;
            ans += rem * pow;
            pow = pow * b;
        }
        return ans;
    }

    public static int decimalToanybase(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % b;
            n /= n / b;
            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
    }
    public static int decimalAddition(int n, int m){
        int carry=0, pow=1, ans=0;
        while(n!=0 || m!=0 || carry!=0){
            int sum=carry+ n%10 + m%10;
            n/=10;
            m/=10;
            carry=sum/10;
            sum%= 10;
            ans+=sum*pow;
            pow=pow*10;
        }return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int p = scn.nextInt();
       System.out.println("enter second no");
        int c = scn.nextInt();
        //int ans=decimalAddition(p,c);
       int ans= decimalToanybase(p, c);
       System.out.println(ans);
        //System.out.println(ans);
    }



}
