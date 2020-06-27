import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite lietuviska zodi mazosiomis raidemis");
        String zodis = sc.next();

        switch (zodis) {
            case "namas":
                System.out.println(zodis + " (liet.) - house (angl.)\n");
                break;
            case "arklys":
                System.out.println(zodis + " (liet.) - horse (angl.)\n");
                break;
            case "vyras":
                System.out.println(zodis + " (liet.) - man (angl.)\n");
                break;
            case "moteris":
                System.out.println(zodis + " (liet.) - woman (angl.)\n");
                break;
            case  "gaidys":
                System.out.println(zodis + " (liet.) - cock (angl.)\n");
                break;
            case "kas":
                System.out.println(zodis + " (liet.) - who (angl.)\n");
                break;
            default:
                System.out.println("Jus ivedete zodi, kurio nera");

        }
  
    }
}
