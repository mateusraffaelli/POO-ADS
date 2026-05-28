package ads.poo;

import java.util.Arrays;

public class Disciplina {

    private  String sigla;
    private DiaDaSemana[] aulas;

    public Disciplina(String sigla, DiaDaSemana[] aulas) {
        this.sigla = sigla;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return  "Sigla: " + sigla +
                "\nDias com aula: " + Arrays.toString(aulas);
    }
}
