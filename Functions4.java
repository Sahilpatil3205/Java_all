package JAVArebound;
import java.util.*;
public class Functions4 {
    public static void circumRadius(double r) {
        double cm=2*3.14*r;
        System.out.println(cm);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextInt();
        circumRadius(r);
        sc.close();
    }
}