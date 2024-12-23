package JAVArebound;
import java.util.Scanner;

public class Bubblesort {
    public static void printArray(int n[]) {
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int n[]=new int [size];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<n.length-1;i++){
           for(int j=0;j<n.length-i-1;j++){
                if(n[j]>n[j+1]){
                    //swap
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
                
           }//time complexity=O(n^2)
        }
        printArray(n);
        sc.close();
    }
}
