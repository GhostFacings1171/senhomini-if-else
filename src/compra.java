import java.util.Scanner;

public class compra {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o preço da compra: ");
        double cmp = scn.nextDouble();
        if (cmp > 1000){
            System.out.println("VocÊ recebeu 15% de desconto");
            double desc = cmp * 0.85;
            System.out.println("o total foi: " + desc);
        }
        else {
            System.out.println("VosÊ recebeu 8% de desconto");
            double desc = cmp * 0.92;
            System.out.println("O total foi: " + desc);
        }
    }
}
