import java.util.*;
public class halfpyramid4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =5;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=a-i;j++){
               System.out.print(" ");
            }
            for( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}