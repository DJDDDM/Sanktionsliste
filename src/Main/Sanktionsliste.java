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
    public Result compare(String name, List<String> Sanktionsliste) {
        for (String line : Sanktionsliste){
            if (line.contains(name)) return new Result(true,line);
        }
        return new Result();
    }



    public void output (String name, Result result) {
        Output Out = Outputhandler.getInstance();
        Out.output(name, result);
    }

    public List<String> createSanktionsliste(){
       Sanktionslistencreator Creator = Sanktionslistenhandler.getInstance();
       return Creator.getSanktionsliste();
    }
}
