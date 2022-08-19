package Output;

import Main.Output;
import Main.Result;
import Output.WindowOutputPackage.WindowBuilder;

public class WindowOutput implements Output {

    @Override
    public void output(String name, Result result) {
        new WindowBuilder().buildwindow(name, result);
    }
}
