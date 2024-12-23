package JAVArebound;
import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("How many subjects:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter marks:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
           
            System.out.println(arr[i]);
        }
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        System.out.println("Total marks: "+total);
        float percent=(float)total/size;
        System.out.println("Percentage: "+percent+"%");
        sc.close();
    }
}
