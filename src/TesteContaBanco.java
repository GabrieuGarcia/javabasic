public class TesteContaBanco {

    public static void main(String[] args) {

        ContaBanco contaBanco1 = new ContaBanco();

        contaBanco1.setNumeroConta(1111);
        contaBanco1.setDonoBanco("Jubileu");
        contaBanco1.abrirConta("CC");
        contaBanco1.depositar(100);

        ContaBanco contaBanco2 = new ContaBanco();
        contaBanco2.setNumeroConta(2222);
        contaBanco2.setDonoBanco("Creuza");
        contaBanco2.abrirConta("CP");
        contaBanco2.depositar(500);

        contaBanco1.estadoAtual();
        contaBanco2.estadoAtual();
    }

}
