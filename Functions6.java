package JAVArebound;
import java.util.*;
import java.lang.Math;
public class Functions6{
    public static void powToAnother(double x,double n) {
        double power= Math.pow(x, n);
        System.out.println(x+"^"+n+"="+power);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt();
        double n=sc.nextInt();
        powToAnother(x, n);
        sc.close();
    }
}
// public class Solutions {
//    public static void main(String args[]) {
//        System.out.println("Enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();


//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }


//        System.out.println("x to the power n is : "+ result);
//    }   
// }
