import Main.Result;
import Main.Sanktionsliste;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SanktionslisteTest {
    Sanktionsliste SL;
    List<String> Sanktionsliste;
    @Before
    public void setup(){
        SL = new Sanktionsliste();
        Sanktionsliste = new ArrayList<>();
        Sanktionsliste.add("Vladimir Putin");
        Sanktionsliste.add("Abu Ali");
    }
    @Test
    public void testcomparefound(){
        Result result = SL.compare("Putin",Sanktionsliste);
        assertTrue(result.flag);
        assertEquals(result.wholeName, "Vladimir Putin");
        assertFalse(SL.compare("Merkel",Sanktionsliste).flag);
    }
    @Test
    public void testcomparenotfound(){
        Result result = SL.compare("Merkel",Sanktionsliste);
        assertFalse(result.flag);
        assertEquals(result.wholeName, "");
    }

}

