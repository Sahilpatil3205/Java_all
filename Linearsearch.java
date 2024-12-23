package JAVArebound;
import java.util.*;
public class Linearsearch {//time complexity=O(n)
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int size=sc.nextInt();
        int n[]=new int[size];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched.");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n.length;i++){
            if(n[i]==target){
                System.out.println("Element found at: "+i);
                found=true;
                break;
            }
            

        }
        if(found==false){
            System.out.println("Element not found");
        }
        sc.close();

    }
}
