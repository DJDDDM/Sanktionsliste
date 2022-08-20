 package Output.WindowOutputPackage;


import Main.Result;
import Output.WindowOutputPackage.Panel.Panelbuilder;
import Output.WindowOutputPackage.Panel.PanelbuilderFactory;
import Output.WindowOutputPackage.Panel.Panelbuildernotfound;

import javax.swing.*;

public class WindowBuilder {
    private WindowProperties properties = new WindowProperties();
    private String name;
    private boolean result;
    public WindowProperties buildwindow(String name, Result result) {
        Panelbuilder Pbuilder = PanelbuilderFactory.getInstance(name,result);
        this.properties = Pbuilder.buildPanel();
        buildFrame();
        return properties;
    }


    private void buildFrame() {
        properties.Frame = new JFrame();
        properties.Frame.setTitle("Sanktionsliste");
        properties.Frame.add(properties.panel);
        properties.Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        properties.Frame.getRootPane().setDefaultButton(properties.Button);
        properties.Frame.pack();
        properties.Frame.setSize(300, 150);
        properties.Frame.setLocationRelativeTo(null);
        properties.Frame.setVisible(true);
    }


}
