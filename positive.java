import java.util.*;
public class positive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive=0 ,negative=0,zeros=0;
        System.out.println("Press 1 to continue or 0 for stop: ");
        int input = sc.nextInt();
        while(input==1){
            System.out.println("Enter the Number: ");
            int num=sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0) {
                negative++;
            }
            else{
                zeros++;
            }
            System.out.println("Press 1 to continue or 0 for stop: ");
            input = sc.nextInt();
        }
        System.out.println("Positives: "+positive);
        System.out.println("Negatives: "+negative);
        System.out.println("Zeros: "+zeros);
    }
}
