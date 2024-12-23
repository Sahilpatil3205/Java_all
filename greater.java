import java.util.*;

public class greater {
    public static void greatFromTwo(int a,int b) {
        if(a>b){
            System.out.println(a+ " is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a= sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b= sc.nextInt();
        greatFromTwo(a, b);
    }
}
