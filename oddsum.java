import java.util.*;

public class oddsum {
    public static void oddSum(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
        if(i%2!=0){
        sum=sum+i;
        }
        
    }    
    System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        oddSum(n);
    }
}
