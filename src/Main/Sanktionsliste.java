package Main;
import Input.Inputhandler;
import Output.Outputhandler;

public class Sanktionsliste {

    public String input() {
        Input In = Inputhandler.getInstance();
        In.greeting();
        return In.getname();

    }
    public boolean compare(String a, String b) {
        return (a.equals(b)) ? true : false;
    }



    public void output (String name, boolean result) {
        Output Out = Outputhandler.getInstance();
        Out.output(name, result);

    }
}
