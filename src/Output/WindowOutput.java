package Output;

import Main.Output;
import Output.WindowOutputPackage.WindowBuilder;

public class WindowOutput implements Output {

    @Override
    public void output(String name, boolean result) {
        new WindowBuilder().buildwindow(name, result);
    }
}
