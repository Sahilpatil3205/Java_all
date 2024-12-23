package JAVArebound;
import java.util.*;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
            System.out.println("X is found at index: "+i);
            }
        }
        sc.close();
    }
}
