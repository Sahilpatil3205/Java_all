
import java.util.*;
public class avg {
    public static void avgOfThree(int a,int b,int c) {
        double avg=(a+b+c)/3;
        System.out.print(avg);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c=sc.nextInt();
        avgOfThree(a,b,c);
    }
    }

