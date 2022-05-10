import java.io.*;
import java.util.*;

public class L12_stringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int count=A.length()+B.length();
        System.out.println(count);
        String big;
        if(A.compareTo(B)>0) {
            big="Yes";
        }
        else {
            big="No";
        }
        System.out.println(big);
        String temp;
        temp = String.valueOf(A.charAt(0));
        temp = temp.toUpperCase();
        A = temp + A.substring(1,A.length());

        temp = String.valueOf(B.charAt(0));
        temp = temp.toUpperCase();
        B = temp + B.substring(1,B.length());
        
        System.out.println(A + " " + B);
    }
}

