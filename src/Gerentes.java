public class Gerentes extends Funcionario{
    private String nomeusuario, senha;

    public Gerentes(String nome, double salario, String nomeusuario, String senha) {
        super(nome, salario);
        this.nomeusuario = nomeusuario;
        this.senha = senha;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double CalculaBonificacao(){
        double bonificacao = salario * 0.20;
        return bonificacao;
    }

    public void Mostrardados(){
        System.out.println("Nome:" + nome + "\n Salário:" + salario + "\n Nome de usuário:" + nomeusuario + "\n Senha:" + senha);
    }

}
