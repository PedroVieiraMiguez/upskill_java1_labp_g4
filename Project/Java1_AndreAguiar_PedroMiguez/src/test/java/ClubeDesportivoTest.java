import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClubeDesportivoTest {

    @org.junit.jupiter.api.Test
    void addAtleta() {
        ClubeDesportivo test = new ClubeDesportivo("Sitio", "Ontem");
        Atleta a1 = new Atleta();
        int expected = 1;
        test.addAtleta(a1);

        assertEquals(1, test.getAtletasInscritos().size());
    }
}