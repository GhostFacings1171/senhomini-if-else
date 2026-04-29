import java.util.Scanner;

public class turno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite em letras minusculas sem acento");
        System.out.println("Digite seu turno: ");
        String turno = sc.nextLine();

        if (turno.equals("manha")){
            System.out.println("Você é fudido e estuda das 7:00 às 12:00");

        } else if (turno.equalsIgnoreCase("tarde")) {
            System.out.println("Você estuda das 13:00 às 18:00");

        } else if (turno.equalsIgnoreCase("noite")) {
            System.out.println("Você é sigma e estuda das 19:00 às 23:00");

        }
        else {
            System.out.println("Digita o nome de um turno direito po");
        }


    }
}
