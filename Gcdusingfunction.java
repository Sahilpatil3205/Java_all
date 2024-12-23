package JAVArebound;
import java.util.Scanner;
public class Gcdusingfunction {
    public static void gCD(int a,int b) {
        int gcd=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gCD(a, b);
        sc.close();
    }
}
