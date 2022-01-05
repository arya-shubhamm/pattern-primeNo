
    import java.util.*;
  
  public class prime{
      public static boolean isPrime(int num){
          for( int i= 2;i<num;i++){
            if((num%i)==0)  
             return false;
          }
          return true;
      }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter a no : ");
      int t = scn.nextInt();
        boolean ans= isPrime(t);
    System.out.println(ans);
          
    }
  }

