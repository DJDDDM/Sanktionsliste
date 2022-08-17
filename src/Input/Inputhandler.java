package Input;

import Main.Input;

public class Inputhandler {
    public static Input getInstance(){
        //return new consoleInput();
        return new WindowInput();
    }
}
