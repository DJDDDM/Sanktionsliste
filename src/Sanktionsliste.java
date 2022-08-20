import Main.Result;
import Main.Sanktionslistencontroller;
import Main.Sanktionslistenentry;

import java.util.List;

public class Sanktionsliste {
    public static void main(String[] args) {
        Sanktionslistencontroller SL = new Sanktionslistencontroller();
        String input = SL.input();
        List<Sanktionslistenentry> Sanktionsliste = SL.createSanktionsliste();
        Result result = SL.compare(input, Sanktionsliste);
        SL.output(input, result);
    }
}

