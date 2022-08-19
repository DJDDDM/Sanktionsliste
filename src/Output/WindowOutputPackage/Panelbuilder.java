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
        properties.out = new JLabel(buildoutstring());
        properties.panel.add(properties.out);
        return properties;
    }

    private String buildoutstring(){
        String outstring = this.name;
        if (this.result) outstring += " steht drauf";
        else outstring += " steht nicht drauf";
        return outstring;
    }
}
