package JAVArebound;
import java.util.Scanner;
public class fibonaaci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Fibonacci Series
        System.out.println("Enter how many Digits Series you want: ");
        int n=sc.nextInt();
        System.out.println();
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        System.out.println(c);
    }
    sc.close();
    }

}
