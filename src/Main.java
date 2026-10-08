import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> lista = new ArrayList<>();

        String continuar;
        do {
            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("email: ");
            String email = sc.nextLine();
            System.out.print("telefone: ");
            String telefone = sc.nextLine();
            System.out.print("senha: ");
            String senha = sc.nextLine();

            Usuario usuario = new Usuario(nome, email, telefone, senha);
            lista.add(usuario);

            System.out.print("Cadastrar mais um?(s/n) ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        Usuario user = lista.get(0);
        System.out.println("Nome: " + user.getNome()
                + " / Email: " + user.getEmail()
                + " / Telefone: " + user.getTelefone());

    }
}