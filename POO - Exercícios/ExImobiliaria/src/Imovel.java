public class Imovel {
    private double areaTotal;
    private double areaConstruida;
    private int numeroQuartos;
    private int numeroBanheiros;
    private int numeroVagasGaragem;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private double valor;
    private double valorIPTU;
    private int anoConstrucao;

    public Imovel() {}

    public Imovel (double areaTotal, double areaConstruida, int numeroQuartos, int numeroBanheiros,
                   int numeroVagasGaragem, String endereco, String bairro, String cidade, String estado,
                   String cep, double valor, double valorIPTU, int anoConstrucao) {
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.valor = valor;
        this.valorIPTU = valorIPTU;
        this.anoConstrucao = anoConstrucao;
        }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public int getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public int getNumeroVagasGaragem() {
        return numeroVagasGaragem;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public double getValor() {
        return valor;
    }

    public double getValorIPTU() {
        return valorIPTU;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }

    public void setNumeroVagasGaragem(int numeroVagasGaragem) {
        this.numeroVagasGaragem = numeroVagasGaragem;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValorIPTU(double valorIPTU) {
        this.valorIPTU = valorIPTU;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }
}