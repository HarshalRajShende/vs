
import java.util.*;
import java.io.*;

public class Reverse {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int temp = n;
      int reverse = 0;
      while (temp > 0) {
         reverse = reverse * 10 + temp % 10;
         temp /= 10;

      }
      System.out.print(reverse);

   }
}
