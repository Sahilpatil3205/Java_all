package JAVArebound;
import java.util.*;
public class factorialusingfunstions {
    public static void factorialOfNo(int n) {

        if(n<0){
            System.out.println("Yo Bitch!!!");
            return;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        factorialOfNo(n);
        sc.close();
    }
}
