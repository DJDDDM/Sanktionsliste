package Sanktionslistencreation;

import Main.Sanktionslistencreator;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.util.*;

public class XMLCreator implements Sanktionslistencreator{
    public List<String> getSanktionsliste() {
        try {
            NodeList Sanktionsnodes = getNodes();
            List<String> Sanktionsliste = fillListfromNodeList(Sanktionsnodes);
            return Sanktionsliste;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private NodeList getNodes() throws Exception{
        Document Doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(getFilename());
        XPathExpression expr = XPathFactory.newInstance().newXPath().compile(getExpression());
        NodeList nodes = (NodeList) expr.evaluate(Doc, XPathConstants.NODESET);
        return nodes;
    }

    private List<String> fillListfromNodeList(NodeList nodes){
        List<String> values = new ArrayList<>();
        for (int i = 0; i < nodes.getLength(); i++) {
            values.add(nodes.item(i).getNodeValue());
        }
        return values;
    }

    protected String getExpression() {return "/export/sanctionEntity/nameAlias/@wholeName";}
    protected String getFilename() {return "Sanktionsliste.xml";}

}
