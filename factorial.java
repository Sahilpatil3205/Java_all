import java.util.*;
    public class factorial {
    
        public static void factorialNo(int a) {
            if(a<0){
                System.out.println("Invalid Input");
                return;
            }
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+a+" is: "+factorial);
        return ;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a=sc.nextInt();
        factorialNo(a);
    }    
}
//Functions= are the block of code which we can called directly
//Methods= are the same as functions but to called it we need objects of classes.