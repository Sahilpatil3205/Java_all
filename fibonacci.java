import java.util.*;
public class fibonacci {
    public static void fiboSeries(int n) {
        //Fibonacci Series
        int a=0,b=1,c;
        System.out.println("\n");
        System.out.println(a);
        System.out.println(b);

        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        fiboSeries(n);
    }
}
