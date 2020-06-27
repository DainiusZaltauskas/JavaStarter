import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite cilindro pagrindo apskritimo spinduli");
        int r = sc.nextInt();
        System.out.println("Iveskite cilindro aukstines ilgi");
        int h = sc.nextInt();

        double V = PI * pow(r, 2) * h;
        System.out.println("Cilindro turis: V=" + V);
        double S = 2 * PI * r * ( r + h);
        System.out.println("Cilinfro pavirsiaus plotas: S=" + S);
    }
}

