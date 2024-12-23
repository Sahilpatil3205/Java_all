package JAVArebound;
import java.util.*;
public class functions5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int pos=0,neg=0,zeros=0;
        System.out.println("Press 1 or 0 to stop program");
        int input=sc.nextInt();
        System.out.println("Enter the numbers:");
        while(input==1)
        {
            int n=sc.nextInt();
            if(n>0){
                pos++;
            }else if(n<0){
                neg++;
            }
            else{
                zeros++;
            }
            System.out.println("Press 1 or 0 to stop program");
            input=sc.nextInt();
        }
        
        System.out.println("Postives are: "+pos);
        System.out.println("Negatives are: "+neg);
        System.out.println("Zeros are: "+zeros);

        sc.close();
    }
}
