package Input.WindowInputpackage;

import Input.WindowInputpackage.WindowProperties;

public class WindowFinisher {
    private WindowProperties Window;
    public WindowFinisher(WindowProperties window) {
        this.Window = window;
    }
    public String finish(){
        String name = Window.tfName.getText();
        Window.Frame.dispose();
        return name;
    }
}
