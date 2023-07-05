import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, por favor insira o que deseja pesquisar: ");
        String palavraPesquisa = sc.next();

        sc.close();

    }
}
