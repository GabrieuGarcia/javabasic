public class TestandoCaneta {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = " azul ";
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = " vermelha ";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }

}
