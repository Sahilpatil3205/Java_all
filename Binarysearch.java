package JAVArebound;
import java.util.*;
public class Binarysearch{
    public static int binarySearch(int arr[],int low,int high,int key) {
        if (low<=high) {
            int mid=low+(high-low)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                return binarySearch(arr,mid+1,high,key);
            }
            else{
                return binarySearch(arr,low,mid+1,key);
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int arr[]={7,8,3,1,2};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Enter element to be searched: ");
        int key=sc.nextInt();
        int result=binarySearch(arr, 0, n-1, key);
        if(result==-1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element found at index: "+result);
        }

        sc.close();
    }

}
