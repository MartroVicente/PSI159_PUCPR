import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorCorretores {
    private ArrayList<Corretor> corretores;

    public GestorCorretores() {
        corretores = new ArrayList<>();
    }

    public void adicionarCorretor(Corretor corretor) {
        corretores.add(corretor);
    }

    public void listarCorretores() {
        if (corretores.isEmpty()) {
            System.out.println("Nenhum corretor cadastrado!");
        } else {
            for (Corretor corretor : corretores) {
                System.out.println("Nome: " + corretor.getNome() + " " + corretor.getSobrenome());
            }
        }
    }

    public void cadastrarNovoCorretor(Scanner sc) {
        System.out.println("Cadastro de novo corretor:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Número da Credencial CEFI: ");
        String numeroCredencialCefi = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Corretor novoCorretor = new Corretor(nome, sobrenome, dataNascimento, cpf, email, telefone,
                numeroCredencialCefi, endereco, cidade, estado, cep);

        adicionarCorretor(novoCorretor);
        System.out.println("Corretor cadastrado com sucesso!");
    }
}