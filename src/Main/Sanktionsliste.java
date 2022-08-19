package Main;
import Input.Inputhandler;
import Output.Outputhandler;
import Sanktionslistencreation.Sanktionslistenhandler;

import java.util.List;

public class Sanktionsliste {

    public String input() {
        Input In = Inputhandler.getInstance();
        In.greeting();
        return In.getname();

    }
    public boolean compare(String name, List<String> Sanktionsliste) {
        for (String line : Sanktionsliste){
            if (line.contains(name)) return true;
        }
        return false;
    }



    public void output (String name, boolean result) {
        Output Out = Outputhandler.getInstance();
        Out.output(name, result);
    }

    public List<String> createSanktionsliste(){
       Sanktionslistencreator Creator = Sanktionslistenhandler.getInstance();
       return Creator.getSanktionsliste();
    }
}
