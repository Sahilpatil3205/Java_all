import java.util.*;
public class bitwiseoperators {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=1010;
        int b=0110;
        System.out.println("Check the case:[1=(&)],[2=(|)],[3=(~)],[4=(^)],[5=(>>)],[6=(<<)]: ");
        int Key= sc.nextInt();
        switch (Key) {
            
            case 1:
            System.out.println(a&b);
            break;
            case 2:
            System.out.println(a|b);
            break;
            case 3:
            System.out.println(~a);
            System.out.println(~b);
            break;
            case 4:
            System.out.println(a^b);
            break;
            case 5:
            System.out.println(a>>b);
            break;
            case 6:
            System.out.println(a<<b);
            break;
            default:
            System.out.println("Invalid Input");
            break;
               
        }
    }
    
}

