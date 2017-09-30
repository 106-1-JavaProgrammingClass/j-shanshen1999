import java.util.Scanner;

public class HW8 {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println((double)Math.round(a*0.26418*10)/10f);
    }
}
