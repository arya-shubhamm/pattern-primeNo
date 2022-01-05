import java.util.*;
public class passorfail {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter you phy no");
        int num1=scn.nextInt();
        System.out.println("Enter you chem no");
        int num2=scn.nextInt();
        System.out.println("Enter you math no");
        int num3=scn.nextInt();
        float sum= (num1+num2+num3)/3.0F;
        if(sum>40 && num1>30 && num2>30 && num3>30){
            System.out.println("you are pass");
        }
        else{
            System.out.println("you are fail");
        }
    }
    
}
