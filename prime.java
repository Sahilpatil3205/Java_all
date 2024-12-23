import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean prime=true;
        
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            if(n==1){
                System.out.println("It is neither prime nor composite.");
            }
            else{
                System.out.println("It is a prime number.");
            }
        }else{
            System.out.println("It is not a prime number.");
        }
    }
}