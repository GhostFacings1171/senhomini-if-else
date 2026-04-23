import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de usuário: ");
        String user = sc.nextLine();
        System.out.println("Digite a senha: ");
        String psw = sc.nextLine();
        if (psw.equals("fiap2026") && user.equals("admin")){
            System.out.println("Usuário e senha corretos, logando...");
        } else if (user.equals("admin") && !psw.equals("fiap2026")) {
            System.out.println("Senha errada");
        } else if (!user.equals("admin")) {
            System.out.println("Usuário não encontrado");
        }
    }
}
