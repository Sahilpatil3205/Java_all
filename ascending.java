import java.util.*;
public class ascending {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        // for(int i=0;i<numbers.length;i++){
        //     System.out.println(numbers[i]);
        // }
        boolean isAscending=true;

        for(int i=0;i<numbers.length-1;i++)//-1 is termination condition
        {
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
                
            }
        }

        if(isAscending==true){
            System.out.println("The Array is Sorted. ");
        }
        else{
            System.out.println("The Array is not Sorted.");
        }

    }
}
