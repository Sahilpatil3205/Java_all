package JAVArebound;
import java.util.*;

public class jaggedarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[][]=new int [3][];
        x[0]=new int[2];
        x[1]=new int[4];
        x[2]=new int[3];
        System.out.println("Enter the elements of the array: ");
        //1st array
        x[0][0]=1;
        x[0][1]=2;
        //2nd array
        x[1][0]=3;
        x[1][1]=4;
        x[1][2]=5;
        x[1][3]=6;
        //3rd array
        x[2][0]=7;
        x[2][1]=8;
        x[2][2]=9;
        //loop for 1st array
        for(int i=0;i<2;i++){
            System.out.print(x[0][i]+" ");
        }
        System.out.println();
         //loop for 2nd array
        for(int i=0;i<4;i++){
            System.out.print(x[1][i]+" ");
        }
        System.out.println();
         //loop for 3rd array
        for(int i=0;i<3;i++){
            System.out.print(x[1][i]+" ");
        }
        sc.close();

    }
}
