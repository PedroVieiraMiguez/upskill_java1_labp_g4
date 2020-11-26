
import org.junit.jupiter.api.Test;
import sprint.clube.desportivo.*;

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
    void testCalcularPagamentoAmador() {
        AtletaAmador a1 = new AtletaAmador("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        double expected = 100 * 0.2 + 100 * 0.07;
        double result = a1.calcularPagamento();

        assertEquals(expected, result);
    }

    @Test
    void testCalcularPagamentoProfissional() {
        AtletaProfissional a1 = new AtletaProfissional("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 100);
        double expected = 100 + (100 * 0.2);
        double result = a1.calcularPagamento();

        assertEquals(expected, result);
    }

    @Test
    void testCalcularPagamentoSemiProfissional() {
        AtletaSemiProfissional a1 = new AtletaSemiProfissional("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 15);
        double expected = 100+ (100 * 0.08);
        double result = a1.calcularPagamento();

        assertEquals(expected, result);
    }

    @Test
    void testFreqCardTrabalho() {
        AtletaAmador a1 = new AtletaAmador("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        double expected = 60 + (0.6 * ((208.75 - (0.73 * 20)) - 60));
        double result = a1.freqCardTrabalho();

        assertEquals(expected, result);
    }

    @Test
    void testFreqCardMax() {
        AtletaAmador a1 = new AtletaAmador("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        double expected = 208.75 - (0.73 * 20);
        double result = a1.freqCardMax();

        assertEquals(expected, result);
    }

    @Test
    void testDeterminarIT() {
        AtletaAmador a1 = new AtletaAmador("João", 123, 20, 60, 100,
                Genero.MASCULINO, Atividade.CAMINHADA, ObjectivoTreino.QUEIMA_GORDURA, 21);
        double expected = 0.6;
        double result = a1.determinarIT();

        assertEquals(expected, result);

    }
}