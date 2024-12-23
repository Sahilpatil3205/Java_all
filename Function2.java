package JAVArebound;
import java.util.*;
public class Function2 {
    public static void sumOfOdd(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
}
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Till how much you want to take sum of odd numbers: ");
        int n=sc.nextInt();
        sumOfOdd(n);
        sc.close();
    }
}
