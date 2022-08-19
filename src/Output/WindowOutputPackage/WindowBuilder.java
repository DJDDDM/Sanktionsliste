 package Output.WindowOutputPackage;


import javax.swing.*;

public class WindowBuilder {
    private WindowProperties properties = new WindowProperties();
    private String name;
    private boolean result;
    public WindowProperties buildwindow(String name, boolean result) {
        this.properties = new Panelbuilder(name,result).buildPanel();
        buildFrame();
        return properties;
    }


    private void buildFrame() {
        properties.Frame = new JFrame();
        properties.Frame.setTitle("Sanktionsliste");
        properties.Frame.add(properties.panel);
        properties.Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        properties.Frame.pack();
        properties.Frame.setSize(300, 150);
        properties.Frame.setLocationRelativeTo(null);
        properties.Frame.setVisible(true);
    }


}
