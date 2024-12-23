import java.util.*;
public class primebyfunction {
    public static void checkPrime(int a) {

        boolean isPrime=true;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
                if(a==1){
                    System.out.println("Is neither prime nor Composite.");
                }
                else{
                    System.out.println("Is Prime.");
                }
            }
            else{
                System.out.println("Is not Prime.");
            }
        }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        checkPrime(a);
    }
}

