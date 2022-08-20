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
    public Result compare(String name, List<Sanktionslistenentry> Sanktionsliste) {
        for (Sanktionslistenentry Entry : Sanktionsliste){
            if (Entry.wholeName.toLowerCase().contains(name.toLowerCase())) return new Result(true,Entry);
        }
        return new Result();
    }



    public void output (String name, Result result) {
        Output Out = Outputhandler.getInstance();
        Out.output(name, result);
    }

    public List<Sanktionslistenentry> createSanktionsliste(){
       Sanktionslistencreator Creator = Sanktionslistenhandler.getInstance();
       return Creator.getSanktionsliste();
    }
}
