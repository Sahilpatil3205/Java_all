package JAVArebound;
import java.util.*;
public class Functions3 {
    public static void greaterThan(int a,int b) {
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greaterThan(a, b);
        sc.close();
    }
}