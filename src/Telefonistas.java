public class Telefonistas extends Funcionario{
    private String codEstacao;

    public Telefonistas(String nome, double salario, String codEstacao) {
        super(nome, salario);
        this.codEstacao = codEstacao;
    }

    public String getCodEstacao() {
        return codEstacao;
    }

    public void setCodEstacao(String codEstacao) {
        this.codEstacao = codEstacao;
    }
}
