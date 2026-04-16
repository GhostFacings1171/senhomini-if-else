import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nosso hotel cobra 250 reais a diária, quantos dias você passará?");
        int dia = sc.nextInt();
        if (dia > 15){
            double preço = 250 + (dia * 15.5);
            System.out.println("Você pagará " + preço + " reais");
        }
        else if (dia == 15){
            double preço = 250 + (dia * 36);
            System.out.println("Você pagará " + preço + " reais");

        }
        else{
            double preço = 250 + (dia * 58);
            System.out.println("Você pagará " + preço + " reais");

        }

    }
}
