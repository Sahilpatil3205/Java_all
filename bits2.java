import java.util.*;
public class bits2 {
    public static void main(String[] args) {
        //clear bit operation
        int n=5;//0101
        int pos=2;//0010
        int bitmask=1<<pos;
        //do And with not
        int newbitmask=~(bitmask);
        int newnumber= newbitmask & n;
        System.out.println(newnumber);

        
        
    }
}
