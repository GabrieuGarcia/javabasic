public class Aula {

    String nomeAula;
    int tempo;
    boolean statusAula;

    void status(){
        System.out.println("Nome: " + this.nomeAula);
        System.out.println("Tempo: " + this.tempo);
        System.out.println("Status: " + this.statusAula);
    }

    void verficarAula(){
        if(this.statusAula == true){
            System.out.println("A aula vai comecar");
        } else {
            System.out.println("A aula ja terminou");
        }
    }

    void aulaVaiComecar(){
        System.out.println(this.statusAula = true);
    }

    void aulaJaTerminou(){
        System.out.println(this.statusAula = false);
    }

}
