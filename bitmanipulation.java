import java.util.*;
public class bitmanipulation {
    public static void main(String[] args) {

        //get bit operation
        int bit=4;//0100
        int pos=2;//0010
        int bitmask=1<<pos;
        if((bitmask & bit)==0){
            System.out.println("Bit was 0");

        }else{
            System.out.println("Bit was 1");
        }
    }
    
}
