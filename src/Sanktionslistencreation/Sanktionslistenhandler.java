package Sanktionslistencreation;

import Main.Sanktionslistencreator;

public class Sanktionslistenhandler {
    public static Sanktionslistencreator getInstance(){
        return new XMLCreator();
    }
}
