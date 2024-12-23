import java.util.*;
public class calci {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the First Number:");
        int a= sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b= sc.nextInt();
        int Key = sc.nextInt();
        switch (Key) {
            case 1:
            System.out.println("Addition is: "+(a+b));    
            break;
            case 2:
            System.out.println("Subtraction is: "+(b-a));    
            break;
            case 3:
            System.out.println("Multiplication is: "+(a*b));    
            break;
            case 4:
            System.out.println("Division is: "+(a/b));    
            break;
        
            default:
            System.out.println("Invalid Key");
                break;
        }
    }
    
}
