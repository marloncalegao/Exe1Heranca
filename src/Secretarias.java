public class Secretarias extends Funcionario{
    private int numRamal;

    public Secretarias(String nome, double salario, int numRamal) {
        super(nome, salario);
        this.numRamal = numRamal;
    }

    public int getNumRamal() {
        return numRamal;
    }

    public void setNumRamal(int numRamal) {
        this.numRamal = numRamal;
    }

    public void Mostrardados(){
        System.out.println("Nome:" + nome + "\n Salário:" + salario + "\n Número de ramal:" + numRamal);
    }

}
