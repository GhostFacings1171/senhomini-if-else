import java.util.Scanner;

public class menorentre3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Escreva o segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.println("Escreva o terceiro numero: ");
        double num3 = sc.nextDouble();;
        if (num1 != num2 && num1 != num3 && num2 != num3){
            double menor = Math.min(num1, Math.min(num2, num3));
            System.out.println("O menor número é: " + menor);
        }
        else {
            System.out.println("ERRO");
        }
    }
}
