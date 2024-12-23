package JAVArebound;
import java.util.*;

public class arrays4withcmdargs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if(args.length != 2) {
            System.out.println("Please enter values: ");
            System.out.println("Enter first value:");
            int s1 = sc.nextInt();
            System.out.println("Enter Second Value:");
            int s2 = sc.nextInt();
           System.out.println("Sum:"+(s1+s2));
            
            
        }else{
        
            // Take two numbers that must be in string form from the command-line arguments
            String s1 = args[0];
            String s2 = args[1];

            // For using in double, convert it first
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);

            // Add them and print
            System.out.println("sum: " + (d1 + d2));}
            sc.close();
        
    }
}

 