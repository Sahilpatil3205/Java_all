import java.util.*;
public class comparestrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1.compareTo(s2)==0){//checks s1>s2 ;print +ve   s1==s2;0 print    s1<s2;-ve 
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
//== dont use due to unoccurence error in some cases 