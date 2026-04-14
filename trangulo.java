import java.util.Scanner;

public class trangulo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o valor do 1º lado de um triangulo: ");
        double lado1 = scn.nextDouble();
        System.out.println("digite o valor do 2º lado: ");
        double lado2 = scn.nextDouble();
        System.out.println("escreva o valor do 3º lado: ");
        double lado3 = scn.nextDouble();
        if (lado1 <= lado2 + lado3 && lado2 <= lado1+ lado3 && lado3 <= lado1 + lado2){
            System.out.println("Isso é um triângulo");
            System.out.println("EBAAAA!!!!");
        }
        else {
            System.out.println("Isso não é um triângulo");
            System.out.println("Melhore!!!");
        }



    }
}
