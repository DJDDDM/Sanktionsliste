package Output.WindowOutputPackage.Panel.found;

import Main.Result;
import Main.Sanktionslistenentry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class moreWindow {
    public void create(Result result) {
        JFrame Frame = new JFrame("zusätzliche Informationen");
        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
        String informations = buildinformation(result.Entry);
        JLabel Label = new JLabel(informations);
        Panel.add(Label);
        if (result.Entry.source != null){
            Panel.add(createLink(result));
        }
        JScrollPane scrollPane = new JScrollPane(Panel);
        Frame.add(scrollPane);
        Frame.pack();
        Frame.setSize(300,150);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }

    private JLabel createLink(Result result) {
        String text = "<html> Quelle: <a href=\">" + result.Entry.source + "\">" + result.Entry.source + " </a></html>";
        JLabel Link = new JLabel(text);
        Link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Link.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(result.Entry.source);
                } catch (IOException ex) {
                }
            }
        });
        return Link;
    }

    private String buildinformation(Sanktionslistenentry Entry) {
        String out = "";
        out += "<html>" ;
        if (Entry.firstName != "") out += "Vorname: " + Entry.firstName + "<br>";
        if (Entry.middleName!= "") out += "Mittelname: " + Entry.middleName + "<br>";
        if (Entry.lastName!= "") out += "Nachname: " + Entry.lastName + "<br>";
        if (Entry.wholeName!= "") out += "Vollständiger Name: " + Entry.wholeName + "<br>";
        if (Entry.birthdate != null) out += "Geburtsdatum: " + Entry.birthdate + "<br>";
        out += "</html>" ;
        return out;
    }
}
