import java.time.LocalDate;

public class Corretor {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cpf;
    private String email;
    private String telefone;
    private String numeroCredencialCefi;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;

    public Corretor() {}

    public Corretor(String nome, String sobrenome, LocalDate dataNascimento, String cpf,
                    String email, String telefone, String numeroCredencialCefi,
                    String endereco, String cidade, String estado, String cep) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.numeroCredencialCefi = numeroCredencialCefi;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumeroCredencialCefi() {
        return numeroCredencialCefi;
    }

    public String getEndereco() {
        return endereco;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNumeroCredencialCefi(String numeroCredencialCefi) {
        this.numeroCredencialCefi = numeroCredencialCefi;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
}

