import java.util.*;
public class assignmentopeartors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=5;
        int b=4;
        System.out.println("Check the case: [1=(=)],[2=(+=)],[3=(*=)],[4=(-=),[5=(/=)],[6=(%=): ]]");
        int key=sc.nextInt();
        switch (key) {
            case 1:
            a=b;
            System.out.println(a);
            break;
            case 2:
            a+=b;
            System.out.println(a);
            break;
            case 3:
            a*=b;
            System.out.println(a);
            break;
            case 4:
            a-=b;
            System.out.println(a);
            break;
            case 5:
            a/=b;
            System.out.println(a);
            break;
            case 6:
            a%=b;
            System.out.println(a);     
            break;

            default:
            System.out.println("Invalid Output");
                break;
        }
    }
}
