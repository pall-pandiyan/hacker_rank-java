    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class L04_ifElse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            
            if(n%2==1){
              System.out.println("Weird");
            }
            else{
                if(n>5 && n<21) {
                    System.out.println("Weird");
                }
                else {
                    System.out.println("Not Weird");
                }
            }
        }
    }
