import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Digite a primeira nota: ");
        double n1 = scn.nextDouble();
        System.out.printf("Digite a segunda nota: ");
        double n2 = scn.nextDouble();
        System.out.printf("Digite a terceira nota: ");
        double n3 = scn.nextDouble();
        double md = (n1 + n2 + n3)/ 3;
        System.out.println("A média foi: " + md);
        if (md < 6){
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Pabéns, vose pasou");
        }
    }
}
