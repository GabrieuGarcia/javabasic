public class Caneta {

   public String modelo;
   public String cor;
   private Float ponta;
   protected int carga;
   protected boolean tampada;

    void status(){
        System.out.printf("Modelo: " + this.modelo);
        System.out.printf("Cor: " + this.cor);
        System.out.printf("Ponta: " + this.ponta);
        System.out.printf("Carga:" + this.carga);
        System.out.printf("Esta tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada ==true){
            System.out.printf("Nao posso rabiscar");
        } else {
            System.out.printf("Posso rabiscar");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }



}
