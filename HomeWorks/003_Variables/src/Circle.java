import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double plotas;


        System.out.println("Iveskite apskritimo spinduli");
        r = sc.nextInt();
        plotas = PI * pow(r, 2);
        System.out.println("Apskritimo plotas yra " + plotas);
    }
}
