import java.util.Scanner;

public class anobisexu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o anus para saber se é bisexu ou não: ");
        int anus = scn.nextInt();

        if ((anus % 4 == 0 && anus % 100 != 0) || anus % 400 == 0){
            System.out.println("É bisexu");
        }
        else {
            System.out.println("não é bisexu");
        }
    }
}
