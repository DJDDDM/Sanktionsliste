package Input;

import Input.WindowInputpackage.*;
import Main.Input;

public class WindowInput implements Input {
    private String name;
    @Override
    public void greeting() {
        WindowProperties Window = new WindowBuilder().buildwindow();
        new Waiter(Thread.currentThread()).waiting();
        this.name = new WindowFinisher(Window).finish();
    }


    @Override
    public String getname() {
        return this.name;
    }
}



