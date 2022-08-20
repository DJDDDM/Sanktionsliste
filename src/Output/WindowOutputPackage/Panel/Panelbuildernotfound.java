package Output.WindowOutputPackage.Panel;


import Main.Result;
import Output.WindowOutputPackage.WindowProperties;

import javax.swing.*;

public class Panelbuildernotfound implements Panelbuilder {
    private String name;
    private Result result;
    public Panelbuildernotfound(String name, Result result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public WindowProperties buildPanel() {
        WindowProperties properties = new WindowProperties();
        properties.panel = new JPanel();
        properties.out = new JLabel(buildoutstring());
        properties.panel.add(properties.out);
        return properties;
    }

    private String buildoutstring(){
        return this.name + " steht nicht drauf";
    }
}
