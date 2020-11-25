import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClubeDesportivoTest {

    @org.junit.jupiter.api.Test
    void testAddAtleta() {
        ClubeDesportivo test = new ClubeDesportivo("Sitio", "Ontem");
        Atleta a1 = new Atleta();
        int expected = 1;
        test.addAtleta(a1);

        int result = test.getAtletasInscritos().size();

        assertEquals(expected, result);
    }

    @Test
    void testGetNomeClube() {
        ClubeDesportivo test = new ClubeDesportivo("Sitio", "Ontem");
        String expected = "Sitio";
        String result = test.getNomeClube();

        assertEquals(expected, result);
    }
}