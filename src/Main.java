import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;
        x=in.nextInt();
        y=in.nextInt();
        System.out.printf("%d+%d=%d\n",x,y,x+y);
        System.out.printf("%d-%d=%d\n",x,y,x-y);
        System.out.printf("%d*%d=%d\n",x,y,x*y);
        System.out.printf("%d/%d=%d...%d",x,y,x/y,x%y);
        System.out.println();
    }
}