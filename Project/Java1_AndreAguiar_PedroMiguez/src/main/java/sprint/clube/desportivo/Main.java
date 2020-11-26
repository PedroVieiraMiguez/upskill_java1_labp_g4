package sprint.clube.desportivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClubeDesportivo cb1 = new ClubeDesportivo("Vigorosa", "30-5-1965");
        AtletaAmador aa1 = new AtletaAmador("Joana", 123, 20, 51, 250,
                Genero.FEMININO, Atividade.CICLISMO, ObjectivoTreino.CAPACIDADE_CARDIORESPIRATORIA, 10);
        AtletaAmador aa2 = new AtletaAmador("Andrade", 1234, 50, 60, 99,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        AtletaAmador aa3 = new AtletaAmador("Miguel", 12345, 42, 71, 150,
                Genero.MASCULINO, Atividade.NATACAO, ObjectivoTreino.QUEIMA_GORDURA, 2);
        AtletaProfissional ap1 = new AtletaProfissional("Zelda", 111, 20, 55, 421,
                Genero.FEMININO, Atividade.CORRIDA, ObjectivoTreino.CAPACIDADE_CARDIORESPIRATORIA, 200);
        AtletaProfissional ap2 = new AtletaProfissional("Velda", 123, 20, 60, 101,
                Genero.MASCULINO, Atividade.NATACAO, ObjectivoTreino.QUEIMA_GORDURA, 180);
        AtletaProfissional ap3 = new AtletaProfissional("Velda", 123, 20, 60, 101,
                Genero.MASCULINO, Atividade.NATACAO, ObjectivoTreino.QUEIMA_GORDURA, 100);
        AtletaSemiProfissional a5 = new AtletaSemiProfissional("Velda", 123, 20, 60, 101,
                Genero.MASCULINO, Atividade.NATACAO, ObjectivoTreino.QUEIMA_GORDURA, 100);

    }
}
