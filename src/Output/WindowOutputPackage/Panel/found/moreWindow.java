package Output.WindowOutputPackage.Panel.found;

import Main.Result;
import Main.Sanktionslistenentry;

import javax.swing.*;

public class moreWindow {
    public void create(Result result) {
        JFrame Frame = new JFrame("zusätzliche Informationen");
        JPanel Panel = new JPanel();
        String informations = buildinformation(result.Entry);
        JLabel Label = new JLabel(informations);
        Panel.add(Label);
        JScrollPane scrollPane = new JScrollPane(Panel);
        Frame.add(scrollPane);
        Frame.pack();
        Frame.setSize(300,150);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }

    private String buildinformation(Sanktionslistenentry Entry) {
        String out = "";
        out += "<html>" ;
        if (Entry.firstName != "") out += "Vorname: " + Entry.firstName + "<br>";
        if (Entry.middleName!= "") out += "Mittelname: " + Entry.middleName + "<br>";
        if (Entry.lastName!= "") out += "Nachname: " + Entry.lastName + "<br>";
        if (Entry.wholeName!= "") out += "Vollständiger Name: " + Entry.wholeName + "<br>";
        if (Entry.birthdate != null) out += "Geburtsdatum: " + Entry.birthdate + "<br>";
        if (Entry.source != null) out += "Quelle: " + Entry.source + "<br>";
        out += "</html>" ;
        return out;
    }
}
