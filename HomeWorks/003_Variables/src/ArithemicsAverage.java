import java.util.Scanner;

public class ArithemicsAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        float aver;
        System.out.println("Iveskite 1-aji sveika skaiciu");
        a = sc.nextInt();
        System.out.println("Iveskite 2-aji sveika skaiciu");
        b = sc.nextInt();
        System.out.println("Iveskite 3-aji sveika skaiciu");
        c = sc.nextInt();

        aver = (a + b + c) / 3;

        System.out.println("Siu skaiciu vidurkis yra " + aver);

    }
}
