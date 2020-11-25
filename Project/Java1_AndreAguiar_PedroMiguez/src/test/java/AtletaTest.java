import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void testAddPremio() {
        AtletaAmador a1 = new AtletaAmador();
        a1.addPremio(50);
        int expected = 50;
        int result = (int) a1.getPremioAcumulado();

        assertEquals(expected, result);
    }

    @Test
    void testCalcularPagamento() {
        AtletaAmador a1 = new AtletaAmador("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        double expected = 
    }

    @Test
    void testFreqCardTrabalho() {
    }

    @Test
    void testFreqCardMax() {
    }

    @Test
    void testDeterminarIT() {
    }
}