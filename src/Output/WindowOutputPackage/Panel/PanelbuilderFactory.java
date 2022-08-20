package Output.WindowOutputPackage.Panel;

import Main.Result;
import Output.WindowOutputPackage.Panel.found.Panelbuilderfound;

public class PanelbuilderFactory {
    public static Panelbuilder getInstance(String name, Result result){
       if (result.flag) return new Panelbuilderfound(name, result);
       else return new Panelbuildernotfound(name, result);
    }
}
