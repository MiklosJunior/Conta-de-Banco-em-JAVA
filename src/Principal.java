public class Principal {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        //Depositos
        p1.depositar(100);
        p2.depositar(500);

        //Sacar 100 da Creuza
        p2.sacar(100);

        //sacar 150 jubileu
        p1.sacar(150);

        //Pagar Mensalidade
        p1.pagarMensal(0);
        p2.pagarMensal(0);

        //Fechar conta com do Jubileu
        p1.fecharconta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
