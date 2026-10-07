import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> lista = new ArrayList<>();

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
        System.out.println(lista.size());
        System.out.println(usuario);
        System.out.println(usuario);
    }
}