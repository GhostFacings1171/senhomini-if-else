import java.util.Scanner;

public class impostoderenda {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Informe seu salario bruto: ");
        double sb = sc.nextDouble();
        if (sb <= 2112){
            System.out.println("Isento de imposto de renda");
            System.out.println("salário bruto: " + sb);
            System.out.println("Aliquota: Isento");
            double al = 0;
            double sl = (sb * (al/100) + sb;
            System.out.println("salário liquido: " + sl);
        } else if ( sb <= 2826.65) {
            System.out.println("7,5% de imposto");
            System.out.println("salário bruto: " + sb);
            System.out.println("Aliquota: 7,5%");
            double al = 7.5;
            double sl = (sb * (al/100) + sb;
            System.out.println("salário liquido: " + sl);
        } else if ( sb <= 3751.05) {
            System.out.println("15% de imposto");
            System.out.println("salário bruto: " + sb);
            System.out.println("Aliquota: 7,5%");
            double al = 15;
            double sl = (sb * (al/100) + sb;
            System.out.println("salário liquido: " + sl);
        } else if ( sb <= 4664.68) {
            System.out.println("22,5% de imposto");
            System.out.println("salário bruto: " + sb);
            System.out.println("Aliquota: 7,5%");
            double al = 22.5;
            double sl = (sb * (al/100) + sb;
            System.out.println("salário liquido: " + sl);
        } else if ( sb > 4664.68) {
            System.out.println("27,5% de imposto");
            System.out.println("salário bruto: " + sb);
            System.out.println("Aliquota: 7,5%");
            double al = 27.5;
            double sl = (sb * (al/100) + sb;
            System.out.println("salário liquido: " + sl);
        }
    }
}
