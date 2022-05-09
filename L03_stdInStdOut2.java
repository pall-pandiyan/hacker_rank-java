import java.util.Scanner;

public class L03_stdInStdOut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        System.out.print("String: ");
        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            System.out.print(s);
        }
        System.out.print("\n");
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
