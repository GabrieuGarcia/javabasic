public class ContaBanco {

    public int numeroConta;
    protected String tipoConta;
    private String donoBanco;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Dono: " + this.getDonoBanco());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    //Construtor
    public ContaBanco() {
        this.numeroConta = 0;
        this.status = false;
    }

    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatus(true);

        if (tipoConta.equals("CC")) {
            this.setSaldo(50);
        } else if (tipoConta.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em debito");
        } else {
            this.status = false;
        }
        System.out.println("Conta fechada com sucesso!");
    }

    public void depositar(float deposito) {
        if (this.isStatus()) {
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Deposito Realizado com sucesso!");
        } else {
            System.out.println("impossivel realizar o deposito");
        }
    }

    public void sacar(float saque) {
        if (this.isStatus()) {
            if (this.getSaldo() >= saque) {
                this.setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + this.getDonoBanco());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensalidade(float pagamento) {
        float valor;

        if (getTipoConta().equals("CC")) {
            valor = 12;
        } else if (getTipoConta().equals("CP")) {
            valor = 20;

        }
        if (isStatus() == true) {
            if (getSaldo() > pagamento) {
                setSaldo(getSaldo() - pagamento);
            } else {
                System.out.println("Saldo insuficiente");
            }
            System.out.println("Impossivel Pagar");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoBanco() {
        return donoBanco;
    }

    public void setDonoBanco(String donoBanco) {
        this.donoBanco = donoBanco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
