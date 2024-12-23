import java.util.*;
public class logicaloperators {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the third number: ");
        int c=sc.nextInt();
        System.out.println("Check the case:[1=(&&)],[2=(!)],[3=(||)]: ");
        int Key= sc.nextInt();
        switch (Key) {
            //returns true and false
            case 1:
            System.out.println(a>b && b<c);
            break;
            case 2:
            System.out.println(!(a>b));//it change the output
            break;
            case 3:
            System.out.println(a>b || b<c);
            break;
            default:
            System.out.println("Invalid Input");
            break;
               
        }
    }
    
}

