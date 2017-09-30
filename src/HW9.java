import java.util.Scanner;

public class HW9 {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println((double)Math.round(a/600f*10)/10f);
    }
}

