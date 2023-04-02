public class Main {
    public static void main(String[] args) {
        Gerentes g1 = new Gerentes("Jóse",1200,"jose1","123456");
        Telefonistas t1 = new Telefonistas("Márcio",1300,"mar31");
        Secretarias s1 = new Secretarias("Maria",1400,789);

        g1.Mostrardados();
        t1.Mostrardados();
        s1.Mostrardados();

        System.out.println("Bonificações:\n Gerente:R$" + g1.CalculaBonificacao() + "\n Telefonista:R$" + t1.CalculaBonificacao() + "\n Secretaria:R$" + s1.CalculaBonificacao());
    }
}