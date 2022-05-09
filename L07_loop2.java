import java.util.*;
import java.io.*;

class L07_loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int temp=a;
            int itr=1;
            for(int j=0; j<n; j++) {
                temp = temp+(itr*b);
                itr = itr*2;
                if(j==n-1) {
                    System.out.print(temp);
                }
                else {
                    System.out.print(temp+" ");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }
}
