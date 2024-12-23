
import java.util.*;



public class anagram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1="LISTEN";
        String s2="SILENT";
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i] != c2[i]){
                System.out.println("Not Anagram.");
                System.exit(0);
            }
        }
        System.out.println("It is Anagram");
        
    }
    

}
