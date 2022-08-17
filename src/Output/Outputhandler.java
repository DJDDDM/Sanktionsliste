package Output;

import Main.Output;

public class Outputhandler {
    public static Output getInstance(){
        return new WindowOutput();
        //return new consoleOutput();
    }
}
