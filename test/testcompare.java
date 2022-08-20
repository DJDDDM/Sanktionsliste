import Main.Result;
import Main.Sanktionslistencontroller;
import Main.Sanktionslistenentry;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class testcompare {
    private List<Sanktionslistenentry> Sanktionsliste;
    private Sanktionslistencontroller SL;
    @Before
    public void setUp(){
        this.SL = new Sanktionslistencontroller();
        this.Sanktionsliste = new ArrayList<>();
        Sanktionslistenentry entry = new Sanktionslistenentry();
        entry.wholeName = "Abu Ali";
        this.Sanktionsliste.add(entry);
    }

    @Test
   public void testnormal(){
        Result result = SL.compare("Abu Ali", Sanktionsliste);
        assertTrue(result.flag);
        assertEquals(result.Entry.wholeName, "Abu Ali");
    }

    @Test
    public void testCasEs(){
       Result result = SL.compare("ABU ali",Sanktionsliste);
       assertTrue(result.flag);
    }

    @Test
    public void testfalse(){
        Result result = SL.compare("Merkel", Sanktionsliste);
        assertFalse(result.flag);
    }


}
