public class Main {
    public static void main(String[] args) {
        Gerentes g1 = new Gerentes("Jóse",1200,"jose1","123456");
        Telefonistas t1 = new Telefonistas("Márcio",1300,"mar31");
        Secretarias s1 = new Secretarias("Maria",1400,789);

        System.out.println("Gerente: \n Nome:" + g1.nome + "\n Salário:R$" + g1.salario + "\n Nome de usúario:" + g1.getNomeusuario() + "\n" + g1.getSenha());
        System.out.println("Telefonista: \n Nome:" + t1.nome + "\n Salário:R$" + t1.salario + "\n Código de estação:" + t1.getCodEstacao());
        System.out.println("Secretaria: \n Nome:" + s1.nome + "\n Salário:R$" + s1.salario + "\n Número de ramal:" + s1.getNumRamal());

        System.out.println("Bonificações:\n Gerente:R$" + g1.CalculaBonificacao() + "\n Telefonista:R$" + t1.CalculaBonificacao() + "\n Secretaria:R$" + s1.CalculaBonificacao());
    }
}