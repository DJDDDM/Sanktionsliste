package Output.WindowOutputPackage.Panel.found;


import Main.Result;
import Output.WindowOutputPackage.Panel.Panelbuilder;
import Output.WindowOutputPackage.WindowProperties;

import javax.swing.*;

public class Panelbuilderfound implements Panelbuilder {
    private String name;
    private Result result;
    public Panelbuilderfound(String name, Result result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public WindowProperties buildPanel() {
        WindowProperties properties = new WindowProperties();
        properties.panel = new JPanel();
        properties.out = new JLabel(buildoutstring());
        properties.panel.add(properties.out);
        properties.Button = new JButton("mehr Informationen");
        properties.Button.addActionListener(new ButtonListener(result));
        properties.panel.add(properties.Button);
        return properties;
    }

    private String buildoutstring(){
        return "<html>" + this.name + " steht drauf <br/>vollständiger Name: " + result.Entry.wholeName + "</html>";
    }
}
