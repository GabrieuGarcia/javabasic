public class TestandoAula {

    public static void main(String[] args) {

        Aula aula1 = new Aula();
        aula1.nomeAula = "Aula de Java";
        aula1.tempo = 15;
        aula1.aulaVaiComecar();
        aula1.status();
        aula1.verficarAula();

        Aula aula2 = new Aula();
        aula2.nomeAula = "Spring Boot";
        aula2.tempo =  45;
        aula2.aulaJaTerminou();
        aula2.status();
        aula2.verficarAula();
    }

}
