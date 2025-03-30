import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestorCorretores gestorCorretores = new GestorCorretores();
        GestorClientes gestorClientes = new GestorClientes();
        GestorImoveis gestorImoveis = new GestorImoveis();

        while (true) {

            Menu menu = new Menu();

            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    gestorCorretores.cadastrarNovoCorretor(sc);
                    break;
                case 2:
                    gestorClientes.cadastrarNovoCliente(sc);
                    break;
                case 3:
                    gestorImoveis.cadastrarNovoImovel(sc);
                    break;
                case 4:
                    gestorCorretores.listarCorretores();
                    break;
                case 5:
                    gestorClientes.listarClientes();
                    break;
                case 6:
                    gestorImoveis.listarImoveis();
                    break;
                case 7:
                    System.out.println("Encerrando o programa.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}