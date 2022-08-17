import Main.Sanktionsliste;
import org.junit.Test;

import static org.junit.Assert.*;

public class SanktionslisteTest {
    @Test
    public void testcompare(){
        Sanktionsliste SL = new Sanktionsliste();
        assertTrue(SL.compare("Putin","Putin"));
        assertFalse(SL.compare("Putin","Merkel"));
    }

}

