import java.util.Scanner;

public class HHHH {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a + b >= c && a + c >= b && b + c >= a) {
            System.out.println("TRUE");
        } else {
            if (a + b < c && a + c < b && b + c < a)
                System.out.println("FALSE");

        }
    }
}
