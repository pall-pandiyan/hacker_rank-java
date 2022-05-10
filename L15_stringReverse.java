import java.io.*;
import java.util.*;

public class L15_stringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        int len  = A.length();
        int half;
        if(len%2 == 0) {
            half = len/2;
        }
        else {
            half = (len-1)/2;
        }
        int j=len-1;
        boolean flag = true;
        
        // Debugs
/*
        System.out.println("len : " + len);
        System.out.println("half : " + half);
        System.out.println("j : " + j);
*/
        // Debugs
        
        for (int i=0; i< half; i++) {
            if (A.charAt(i) != A.charAt(j)) {
                
                // Debug
/*                System.out.println("i : " + i);
                System.out.println("j : " + j);
                System.out.println("A.charAt(i) : " + A.charAt(i));
                System.out.println("A.charAt(j) : " + A.charAt(j));
*/
                // Debug
                
                flag = false;
                break;
            }
            j--;
        }
        if (flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
