
import java.io.*;
import java.util.*;

public class palindromeofastring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev="";
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        System.out.println();
        
        if(str==rev){
            System.out.println("Yes");
        }
        
        
        
    }
}

