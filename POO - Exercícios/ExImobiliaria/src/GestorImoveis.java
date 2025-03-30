import java.util.Scanner;
import java.util.ArrayList;

public class GestorImoveis {
    private ArrayList<Imovel> imoveis;

    public GestorImoveis() {
        imoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void listarImoveis() {
        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imovel cadastrado!");
        } else {
            for (Imovel imovel : imoveis) {
                System.out.println("Área total: " + imovel.getAreaTotal());
                System.out.println("Área construída: " + imovel.getAreaConstruida());
                System.out.println("Ano construção: " + imovel.getAnoConstrucao());
                System.out.println("Valor imóvel: " + imovel.getValor());
                System.out.println("Endereço: " + imovel.getEndereco() + ", " + imovel.getBairro() + ", " + imovel.getCidade() + ", " + imovel.getEstado());
            }
        }
    }

    public void cadastrarNovoImovel(Scanner sc) {

        System.out.println("Cadastro de novo imóvel:");

        System.out.print("Área total: ");
        double areaTotal = Double.parseDouble(sc.nextLine());

        System.out.print("Área construída: ");
        double areaConstruida = Double.parseDouble(sc.nextLine());

        System.out.println("Número de quartos: ");
        int numeroQuartos = Integer.parseInt(sc.nextLine());

        System.out.println("Numero de banheiros: ");
        int numeroBanheiros = Integer.parseInt(sc.nextLine());

        System.out.println("Numero de vagas garagem: ");
        int numeroVagasGaragem = Integer.parseInt(sc.nextLine());

        System.out.println("Endereço: ");
        String endereco = sc.nextLine();

        System.out.println("Bairro: ");
        String bairro = sc.nextLine();

        System.out.println("Cidade: ");
        String cidade = sc.nextLine();

        System.out.println("Estado: ");
        String estado = sc.nextLine();

        System.out.println("CEP: ");
        String cep = sc.nextLine();

        System.out.println("Valor: ");
        double valor = Double.parseDouble(sc.nextLine());

        System.out.println("Valor IPTU: ");
        double valorIPTU = Double.parseDouble(sc.nextLine());

        System.out.println("Ano construção: ");
        int anoConstrucao = Integer.parseInt(sc.nextLine());

        Imovel novoImovel = new Imovel(areaTotal, areaConstruida, numeroQuartos, numeroBanheiros,
        numeroVagasGaragem, endereco, bairro, cidade, estado,
                cep, valor, valorIPTU, anoConstrucao);

        adicionarImovel(novoImovel);
        System.out.println("Imóvel cadastrado com sucesso!");
    }
}
