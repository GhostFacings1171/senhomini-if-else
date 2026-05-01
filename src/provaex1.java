import java.util.Scanner;

public class provaex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero de pintinhos alojados no galpao: ");
        int pint = sc.nextInt();
        System.out.println("Informe o consumo medio de racao por frango durante todo o ciclo: ");
        double racao = sc.nextDouble();
        System.out.println("Informe o preco do saco de racao de 25kg: ");
        double psaco = sc.nextDouble();
        System.out.println("Informe o preco de venda pago pelo frigorifico por kg de frango vivo: ");
        double venda = sc.nextDouble();
        System.out.println("Intorme o preco medio od frango vivo ao abate: ");
        double peso = sc.nextDouble();

        double totalrc;
        totalrc = pint * racao;
        totalrc = Math.ceil(totalrc);
        System.out.println("O total de racao necessaria para o lote e: " + String.format("%.2f", totalrc) + " kg");


        double sacosrc;
        sacosrc = totalrc / psaco;
        sacosrc = Math.ceil(sacosrc);
        System.out.println("O total de sacos de racao de 25kg a ser comprado e: " + String.format("%.2f", sacosrc) + " saco(s)");


        double custracao;
        custracao = psaco * sacosrc;
        custracao = Math.ceil(custracao);
        System.out.println("O custo total da racao e: " + String.format("%.2f", custracao) + " reais");

        double  recbruta;
        recbruta = pint * peso * venda;
        recbruta = Math.ceil(recbruta);
        System.out.println("A receita bruta do lote e: " + String.format("%.2f", recbruta) + " reais");


        double lucbruto;
        lucbruto = recbruta  - custracao;
        lucbruto = Math.ceil(lucbruto);
        System.out.println("O lucro bruto e: " + String.format("%.2f", lucbruto) + " reais");
        System.out.println("TODOS OS VALORES SÃO ARREDONDADOS PARA CIMA");
    }
}
