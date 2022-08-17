package Output.WindowOutputPackage;


import javax.swing.*;

public class Panelbuilder {
    private String name;
    private boolean result;
    public Panelbuilder(String name, boolean result) {
        this.name = name;
        this.result = result;
    }

    public WindowProperties buildPanel() {
        WindowProperties properties = new WindowProperties();
        properties.panel = new JPanel();
        String outstring = name;
        if (result) outstring += " steht drauf";
        else outstring += " steht nicht drauf";
        properties.out = new JLabel(outstring);
        properties.panel.add(properties.out);
        return properties;
    }
}
