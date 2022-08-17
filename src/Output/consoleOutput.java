package Output;

import Main.Output;

public class consoleOutput implements Output {
    @Override
    public void output(String name, boolean result) {
        if (result) System.out.println(name + " steht drauf");
        else System.out.println(name + " steht nicht drauf");
    }
}
