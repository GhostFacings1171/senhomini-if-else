import java.util.Scanner;

public class oprimo {
    static void main() {
        Scanner sc= new Scanner (System.in);
        System.out.println("digite um valor inteiro positivo");
        int num = sc.nextInt();
        int total = 0;
        if (num<2){
            System.out.println("O Valor eh menor ou igual a 2");
        }
        else {
            for (int cont = 1; cont <= num; cont ++){
                if (num % cont == 0){
                    total++;
                }
            }
            if (total == 2){
                System.out.println("é primu");
            }
            else {
                System.out.println("nao eh primu");
            }
        }
    }
}
