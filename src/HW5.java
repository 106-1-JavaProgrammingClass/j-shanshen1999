import java.util.Scanner;

public class HW5 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        char ch = ',';
        System.out.println((double)(a /2.54*10)/10f);
        System.out.println((double)(b /0.454*10)/10f);
    }
}
