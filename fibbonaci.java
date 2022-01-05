import java.util.*;

public class fibbonaci {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter no");
        int n= scn.nextInt();
        int a=0;
        int b=1;
       System.out.println(a);
       System.out.println(b);
        for(int i=1 ; i<n ; i++){
            int c= a+b;
            System.out.println(c);
             a=b;
             b=c;

        }
     
    }
}
