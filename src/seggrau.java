import java.util.Scanner;

public class seggrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delt = Math.pow(b, 2) - 4 * a * c;
        if (delt < 0){
            System.out.println("Nao existem raizes reais");
        } else if ( delt == 0) {
            double x1;
            x1 = -(b - Math.sqrt(delt) / 2 * a);
            System.out.println(" A raiz é: " + x1);
        }
        else{
            double x1;
            x1 = -(b + Math.sqrt(delt) / 2 * a);
            double x2;
            x2 = -(b - Math.sqrt(delt) / 2 * a);
            System.out.println("As raizes são: " + x1 + " e " + x2);
        }
    }
}
