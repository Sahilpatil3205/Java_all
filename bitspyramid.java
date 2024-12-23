import java.util.*;
public class bitspyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }

            }
            System.out.println();
        }//when we check this pyramid in matrix form every even sum has 1 on it and odd=0 like,(1,1)=1
    }  
}

