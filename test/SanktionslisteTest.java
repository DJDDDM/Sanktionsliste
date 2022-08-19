import Main.Sanktionsliste;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SanktionslisteTest {
    @Test
    public void testcompare(){
        Sanktionsliste SL = new Sanktionsliste();
        List<String> Sanktionsliste = new ArrayList<>();
        Sanktionsliste.add("Vladimir Putin");
        Sanktionsliste.add("Abu Ali");
        assertTrue(SL.compare("Putin",Sanktionsliste));
        assertFalse(SL.compare("Merkel",Sanktionsliste));
    }

}

