import java.util.Scanner;
public class Task122 {
    public static void main (String[] args){
        Scanner skanner = new Scanner(System.in);
        int a,b,s = 0;
        a = skanner.nextInt();
        b = a % 10 ;
        s = s + b + ((a / 10 ) % 10) + a / 100;
        System.out.println(s);
    }
}