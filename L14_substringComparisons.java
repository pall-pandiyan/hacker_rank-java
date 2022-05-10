import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class L14_substringComparisons {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int nsubs = s.length()-(k-1);
        String subs[] = new String[nsubs];
        int x=0;
        
        for (int i=0; i<nsubs; i++) {
            subs[i] = s.substring(x,x+k);
            x++;
        }
        Arrays.sort(subs);
/*
        for (int i=0; i<nsubs-1; i++) {
            if(subs[i].compareTo(subs[i+1]) >0) {
                String temp;
                temp = subs[i];
                subs[i] = subs[i+1];
                subs[i+1] = temp;
            }
        }
*/
        
        smallest = subs[0];
        largest = subs[nsubs-1];
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}