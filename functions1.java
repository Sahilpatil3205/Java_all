package JAVArebound;
import java.util.*;
public class functions1 {
    public static void avgOfThree(int a,int b,int c,int n) {
        int avg=(a+b+c)/n;
        System.out.println("Average of three numbers is: "+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many Numbers:");
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avgOfThree(a, b, c, n);
        sc.close();
    }
}
