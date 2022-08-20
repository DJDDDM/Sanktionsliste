import Main.Sanktionslistencreator;
import Main.Sanktionslistenentry;
import Sanktionslistencreation.Sanktionslistenhandler;
import Sanktionslistencreation.XMLCreator;
import org.junit.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;


public class testSanktionslistencreation{
    @Test
    public void testXML() throws MalformedURLException {
        XMLCreator Creator = new XMLCreator();
        List<Sanktionslistenentry> Sanktionsliste = Creator.getSanktionsliste();
        assertEquals(Sanktionsliste.get(0).wholeName, "Saddam Hussein Al-Tikriti");
        assertEquals(Sanktionsliste.get(0).firstName, "Saddam");
        assertEquals(Sanktionsliste.get(0).middleName, "");
        assertEquals(Sanktionsliste.get(0).lastName, "Hussein Al-Tikriti");
        assertEquals(Sanktionsliste.get(0).source, new URL("http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF"));
        assertEquals(Sanktionsliste.get(0).birthdate, LocalDate.parse("1937-04-28"));
    }

}
