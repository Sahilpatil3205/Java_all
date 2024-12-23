import java.util.*;
public class greaterno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        
        if (a==b){
            System.out.println("equal");
        } else if(a>b){
            System.out.println("A is Greater"+a);
        } else{
            System.out.println("B is greater"+ b);
        }
        
    }
}
