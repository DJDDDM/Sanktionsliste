import Main.Sanktionslistencreator;
import Sanktionslistencreation.Sanktionslistenhandler;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;


public class testSanktionslistencreation{
    @Test
    public void testgenerall() {
        Sanktionslistencreator Creator = Sanktionslistenhandler.getInstance();
        List<String> Sanktionsliste = Creator.getSanktionsliste();
        assertEquals(Sanktionsliste.get(0),"Saddam Hussein Al-Tikriti");
    }

    @Test
    public void testXML(){
       FakeXMLCreator Creator = new FakeXMLCreator();
       Creator.Expression = "/employees/employee/@id";
       Creator.Filename = "test/employees.xml";
       List<String> Liste = Creator.getSanktionsliste();
       assertEquals(Liste.get(0),"1");
    }


}
