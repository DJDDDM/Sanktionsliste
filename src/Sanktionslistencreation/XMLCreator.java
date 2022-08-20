package Sanktionslistencreation;

import Main.Sanktionslistencreator;
import Main.Sanktionslistenentry;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class XMLCreator implements Sanktionslistencreator{
    public List<Sanktionslistenentry> getSanktionsliste() {
        return fillSanktionsliste(getDocument());
    }

    private Document getDocument(){
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(getFilename());
        } catch (Exception e){
            showMessageDialog(null, getFilename() + " wurde nicht gefunden. \nstellen Sie sicher, dass sich die Datei im selben Ordner befindet");
            throw new RuntimeException(e);
        }

    }

    private List<Sanktionslistenentry> fillSanktionsliste(Document document){
        NodeList Entitynodes = document.getDocumentElement().getElementsByTagName("sanctionEntity");
        List<Sanktionslistenentry> Sanktionsliste = createList(Entitynodes);
        return Sanktionsliste;
    }

    private List<Sanktionslistenentry> createList(NodeList Entitynodes) {
        List<Sanktionslistenentry> Sanktionsliste = new ArrayList<>();
        for (int i = 0; i < Entitynodes.getLength(); i++) {
            Element Entityelement = (Element) Entitynodes.item(i);
            NodeList namenodes = Entityelement.getElementsByTagName("nameAlias");
            for (int j = 0; j < namenodes.getLength(); j++) {
                Sanktionsliste.add(fillEntry(Entityelement, j));
            }
        }
        return Sanktionsliste;
    }

    private Sanktionslistenentry fillEntry(Element Entityelement, int j) {
        Sanktionslistenentry Entry = new Sanktionslistenentry();
        Entry = getNames(Entityelement, j);
        Entry.source = getSource(Entityelement, j);
        Entry.birthdate = getbirthdate(Entityelement, Entry);
        return Entry;
    }

    private LocalDate getbirthdate(Element Entityelement, Sanktionslistenentry Entry) {
        try {
            return LocalDate.parse(Entityelement.getElementsByTagName("birthdate").item(0).getAttributes().getNamedItem("birthdate").getNodeValue());
        } catch (NullPointerException e) {
            return null;
        }
    }

    private Sanktionslistenentry getNames(Element Entityelement, int j) {
        Sanktionslistenentry Entry = new Sanktionslistenentry();
        Entry.firstName = Entityelement.getElementsByTagName("nameAlias").item(j).getAttributes().getNamedItem("firstName").getNodeValue();
        Entry.middleName = Entityelement.getElementsByTagName("nameAlias").item(j).getAttributes().getNamedItem("middleName").getNodeValue();
        Entry.lastName = Entityelement.getElementsByTagName("nameAlias").item(j).getAttributes().getNamedItem("lastName").getNodeValue();
        Entry.wholeName = Entityelement.getElementsByTagName("nameAlias").item(j).getAttributes().getNamedItem("wholeName").getNodeValue();
        return Entry;
    }

    private URI getSource(Element Entityelement, int j) {
        Element Nameelement = (Element) Entityelement.getElementsByTagName("nameAlias").item(j);
        try {
            return new URI(Nameelement.getElementsByTagName("regulationSummary").item(0).getAttributes().getNamedItem("publicationUrl").getNodeValue());
        } catch (URISyntaxException e) {
            return null;
        }
    }

    protected String getFilename() {return "Sanktionsliste.xml";}

}
