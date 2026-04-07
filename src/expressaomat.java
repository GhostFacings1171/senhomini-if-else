import java.util.Scanner;

public class expressaomat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um número inteiro para X: ");
        int x = scn.nextInt();
        if(x == 5){
            System.out.println("Não existe divisão por 0");
        }
        if(x <= 4){
            System.out.println("Não existe divisão por Negativo");
        }
        else{
            double y = 8 / (Math.sqrt((Math.pow(x , 2) - 25)));
            System.out.println(" O valor é: " + y);
        }
    }
}
