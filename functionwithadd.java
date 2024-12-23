import java.util.*;

public class functionwithadd {
    public static void addTwoNumbers(int a,int b) {
        int sum=a+b;
        System.out.println(sum);
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();
        addTwoNumbers(a,b);
    }    
}
