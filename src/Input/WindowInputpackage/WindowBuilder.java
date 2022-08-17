package Input.WindowInputpackage;

import Input.WindowInputpackage.WindowProperties;


import javax.swing.*;

public class WindowBuilder {
    private WindowProperties properties = new WindowProperties();

    public WindowProperties buildwindow() {
        buildPanel();
        buildFrame();
        return properties;
    }

    private void buildPanel() {
        properties.panel = new JPanel();
        properties.Greeting = new JLabel("Gesucht?");
        properties.panel.add(properties.Greeting);
        properties.tfName = new JTextField(20);
        properties.panel.add(properties.tfName);
        buildButton();
        properties.panel.add(properties.Button);
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

    private void buildButton() {
        properties.Button = new JButton("OK");
        properties.Button.addActionListener(new ButtonListener(Thread.currentThread()));
    }
}
