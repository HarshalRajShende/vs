package arr;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    String check = "either all elements are odd or all elements are even";
    boolean hasOdd = false;
    boolean hasEven = false;
      for (int i = 0; i<arr.length; i++) {
        if (arr[i] % 2 == 0) {
            hasEven = true;
            if (hasOdd) { // has both odds and evens
                check="has both odds and evens";
                
            }
        } else {
            hasOdd = true;
            if (hasEven) { // has both odds and evens
                check="has both odds and evens";
                
            }
        }
      }
    System.out.print(check);
    }
    }


