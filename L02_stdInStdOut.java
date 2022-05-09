import java.util.*;

public class L02_stdInStdOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[]= new int[3];
        
        for(int i=0; i<3; i++) {
            a[i] = scan.nextInt();
            System.out.println(a[i]);
        }
    }
}
