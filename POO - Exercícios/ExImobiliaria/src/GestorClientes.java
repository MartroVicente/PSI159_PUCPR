import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorClientes {
    private ArrayList<Cliente> clientes;

    public GestorClientes() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
        } else {
            for (Cliente cliente: clientes) {
                System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
            }
        }
    }

    public void cadastrarNovoCliente(Scanner sc) {

        System.out.println("Cadastro de novo cliente:");

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

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Cliente novoCliente = new Cliente(nome, sobrenome, dataNascimento, cpf, email,
                telefone, endereco, cidade, estado, cep);

        adicionarCliente(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}