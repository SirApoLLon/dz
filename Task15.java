import java.util.Scanner;
public class Task15 {
    public static void main (String[] args){
        Scanner skanner = new Scanner(System.in);
        int a,b,x;
        a = skanner.nextInt();
        b = skanner.nextInt();
        x = skanner.nextInt();
        if (x > a & x < b) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}