import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Two Number: ");
        int a =sc.nextInt();
        int b= sc.nextInt();

        int g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                g=i;
            }
        }
        System.out.println("GCD:- "+g); 

    }
}
