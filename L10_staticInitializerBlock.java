private static boolean flag;
private static int B,H;

static {
    Scanner sc = new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    if((B<1) || (H<1)) {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else {
        flag=true;
    }
}