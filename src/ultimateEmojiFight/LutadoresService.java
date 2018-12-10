package ultimateEmojiFight;

import java.util.ArrayList;
import java.util.List;

public class LutadoresService {

    public static void main(String[] args) {

        Lutador lutador1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        Lutador lutador2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador lutador3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        Lutador lutador4 = new Lutador("DeadCode", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);

        List<Lutador> lutadores = new ArrayList<>();
        lutadores.add(0, lutador1);
        lutadores.add(1, lutador2);
        lutadores.add(2, lutador3);
        lutadores.add(3, lutador4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador1,lutador4);
        UEC01.lutar();
        lutador1.status();
        lutador2.status();
    }

}
