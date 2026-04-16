import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = sc.nextDouble();

        sc.close();

        // Ordena os três números
        double menor, medio, maior;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                maior = n3;
            } else {
                medio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                maior = n3;
            } else {
                medio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                medio = n1;
                maior = n2;
            } else {
                medio = n2;
                maior = n1;
            }
        }

        System.out.printf("Ordem crescente: %.2f, %.2f, %.2f%n", menor, medio, maior);
    }
}

