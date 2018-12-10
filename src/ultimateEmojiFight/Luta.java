package ultimateEmojiFight;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado(Lutador lutador) {
        this.setDesafiado(lutador);
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(Lutador lutador) {
        this.setDesafiante(lutador);
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) &&
                lutador1 != lutador2) {
            this.setAprovada(true);
            this.setDesafiante(lutador1);
            this.setDesafiado(lutador2);
        } else {
            this.setAprovada(false);
            this.getDesafiado(null );
            this.getDesafiante(null);
        }
    }

    public void lutar() {
        if (isAprovada() == true){
            System.out.println("--- DESAFIADO ---");
            this.desafiado.apresentar();
            System.out.println("--- DESAFIANTE ---");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3); // 0 1 2

            switch (vencedor){

                case 0: // Empate
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                System.out.println("Os lutadores " + this.desafiado.getNome() + " e " + this.desafiante.getNome() + " empataram a luta!");
                break;

                case 1: //Desafiado vence
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("O lutador " + this.desafiado.getNome() + " Venceu a luta!");
                break;

                case 2: //Desafiado vence
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println("O lutador " + this.desafiado.getNome() + " Venceu a luta!");
                break;

            }
        } else {
            System.out.println("Luta náo poderá acontecer!");
        }

    }

}
