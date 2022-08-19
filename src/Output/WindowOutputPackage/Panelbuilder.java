package Output.WindowOutputPackage;


import Main.Result;

import javax.swing.*;

public class Panelbuilder {
    private String name;
    private Result result;
    public Panelbuilder(String name, Result result) {
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
        String outstring = "";
        if (this.result.flag){
            outstring = "<html>" + this.name + " steht drauf <br/>vollständiger Name: " + result.wholeName + "</html>";
        }
        else outstring = this.name + " steht nicht drauf";
        return outstring;
    }
}
