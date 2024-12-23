package JAVArebound;

import java.util.*;

public class arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        sc.close();
    }
}
