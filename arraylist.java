package JAVArebound;
import java.util.*;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //get elements
        System.out.println(list.get(0));

        //add elements in between
        list.add(1, 4);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //remove element
        list.remove(3);
        System.out.println(list);

        //size of arraylist
        System.out.println(list.size());

        //get all elements
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    

    }
}
