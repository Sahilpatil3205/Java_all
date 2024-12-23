package JAVArebound;
import java.util.*;
public class BinarySearch3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a[]={7,8,3,1,2};

        int key=sc.nextInt();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int result=Arrays.binarySearch(a,key);
        
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }
        sc.close();
    }
}
