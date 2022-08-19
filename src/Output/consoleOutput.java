package Output;

import Main.Output;
import Main.Result;

public class consoleOutput implements Output {
    @Override
    public void output(String name, Result result) {
        if (result.flag) System.out.println(name + " steht drauf \nvollständiger Name: " + result.wholeName);
        else System.out.println(name + " steht nicht drauf");
    }
}
