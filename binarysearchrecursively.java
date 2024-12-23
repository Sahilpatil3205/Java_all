package JAVArebound;
import java.util.*;
public class binarysearchrecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int low = 0, high = size - 1;
        System.out.println("Enter Element to be searched:");
        int key = sc.nextInt();
        boolean found = false;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevent potential overflow
            if (a[mid] == key) {
                System.out.println("Value found at: " + mid);
                found = true;
                break;
            }
            if (key > a[mid]) {
                low = mid + 1;  // Move the low pointer up
            } else {
                high = mid - 1; // Move the high pointer down
            }
        }
        
        if (!found) {
            System.out.println("Value not found.");
        }
        
        sc.close();
    }
}

