import java.util.*;
public class descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size:");
        int size= sc.nextInt();

        int[] numbers=new int[size];
        
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        boolean isDescending=true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1]){
                isDescending=false;
            }
        }

        if(isDescending==true){
            System.out.println("The array is in descending order.");
        }
        else{
            System.out.println("The array is not in Descending order.");
        }
        
    }
}
