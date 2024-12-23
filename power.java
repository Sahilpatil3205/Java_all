import java.util.*;

public class power {
    public static void powerToAnother(int a,int b) {
        int result=1;
        for(int i=0; i<b; i++) {
           result = result * a;
       }

       System.out.println("x to the power n is : "+ result);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a= sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b= sc.nextInt();
        powerToAnother(a, b);
    }
}

