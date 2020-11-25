import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AtletaAmador a1 = new AtletaAmador("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        AtletaAmador a2 = new AtletaAmador("Andrade", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        AtletaAmador a3 = new AtletaAmador("Zelda", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        ClubeDesportivo test = new ClubeDesportivo("Sitio", "Ontem");
        test.addAtleta(a1);
        test.addAtleta(a2);
        test.addAtleta(a3);


        ArrayList<Atleta> result = test.getSortedByName();

        for (Atleta a : result) {
            System.out.println(a);
        }

        for (Atleta a : test.getAtletasInscritos()) {
            System.out.println(a);
        }
    }
}
