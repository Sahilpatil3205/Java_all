package JAVArebound;
import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]={7,8,3,1,2};

        for(int i=1;i<n.length;i++){
            int temp=n[i];
            int j=i-1;
            while(j>=0 && n[j]>temp){
                n[j+1]=n[j];
                j--;
            }
            n[j+1]=temp;
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        sc.close();
    }
}
