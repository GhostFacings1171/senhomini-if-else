import java.util.Scanner;

public class provaex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento da encomenda: ");
        double comp = sc.nextDouble();
        System.out.println("Digite o altura da encomenda: ");
        double alt = sc.nextDouble();
        System.out.println("Digite o largura da encomenda: ");
        double larg = sc.nextDouble();
        System.out.println("Digite o peso da encomenda: ");
        double peso = sc.nextDouble();

        if (comp > 100 || alt > 100 || larg > 100 && peso >30) {
            System.out.println("Erro, a encomenda nao pode ser entregue");
        } else {
            System.out.println("Sua encomenda cabe nos requisitos e pode sere entregue");
        }
        double vol = comp * larg * alt;
        System.out.println("O Volume e: " + vol + " cm3");
        int tam = 0;
        if (vol <= 1000){
            tam = 1;
            System.out.println("Ele e uma encomenda pequena");
        }else if (vol <= 10000 && vol > 1001){
            tam = 2;
            System.out.println("Ele e uma encomenda media");
        }
        else if (vol > 10000){
            tam = 3;
            System.out.println("Ele e uma encomenda grande");
        }
        System.out.println("Digite qual o numero da regiao que devera ser entregue a encomenda: 1-Capital  2-Interior 3-Zona Rural");
        int reg = sc.nextInt();
        if (reg == 1 && tam == 1){
            System.out.println("1 Dia");
            System.out.println("R$ 12 o frete");
        }else if (reg == 1 && tam == 2){
            System.out.println("3 Dias");
            System.out.println("R$ 18 o frete");
        } else if (reg == 1 && tam == 3){
            System.out.println("5 Dias");
            System.out.println("R$ 25 o frete");
        }else if (reg == 2 && tam == 1){
            System.out.println("2 Dias");
            System.out.println("R$ 22 o frete");
        } else if (reg == 2 && tam == 2){
            System.out.println("4 Dias");
            System.out.println("R$ 32 o frete");
        } else if (reg == 2 && tam == 3){
            System.out.println("7 Dias");
            System.out.println("R$ 45 o frete");
        } else if (reg == 3 && tam == 1){
            System.out.println("3 Dias");
            System.out.println("R$ 38 o frete");
        } else if (reg == 3 && tam == 2){
            System.out.println("6 Dias");
            System.out.println("R$ 55 o frete");
        } else if (reg == 3 && tam == 3){
            System.out.println("10 Dias");
            System.out.println("R$ 75 o frete");
        }else {
            System.out.println("Digite um numero de regiao existente");
        }
    }
}
