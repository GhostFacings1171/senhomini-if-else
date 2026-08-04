import java.util.Scanner;

public class numero_oprimo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero primo positivo)");
        int primo = sc.nextInt();
        if (primo <= 1) {
            System.out.println("O seu numero é menor ou igual a 1, nao funciona");
        }
        if (primo % 2 == 0) {
            System.out.println("Seu numero eh divisivel por 2, nao eh primu");
        }
        for (int i = 3; i <= Math.sqrt(primo); i += 2) {
            if (primo % i == 0) {
                System.out.println("esse numero tem divisor impar, nao eh primo");
            }
        }
    }
}