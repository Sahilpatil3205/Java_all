import java.util.*;
    public class mul {
    
        public static int mulTwoNumbers(int a,int b) {
        int mul=a*b;
        
        return mul;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();
        int mul= mulTwoNumbers(a,b);
        System.out.println(mul);
    }    
}
