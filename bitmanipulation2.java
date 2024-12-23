import java.util.*;
public class bitmanipulation2 {
    public static void main(String[] args) {
        //set bit operation
        int n=5;//0101a
        int pos=1;//0001
        int bitmask=1<<pos;

        int newnumber= bitmask | n;
        System.out.println("New Number after setting bit at position "+pos+" is "+newnumber);
    }
}
