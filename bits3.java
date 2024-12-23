import java.util.*;
public class bits3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Enter position from where to update: ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        System.out.println("Select opeartion: (1) Set,(2) Clear");
        int operation=sc.nextInt();
        switch (operation) {
            case 1:
            int newnumber=bitmask|n;
            System.out.println(newnumber);
            break;
            case 2:
            int notbitmask=~(bitmask);
            int newest=notbitmask & n;
            System.out.println(newest);
            default:
                break;
        }
    }
}
