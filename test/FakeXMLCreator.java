import Sanktionslistencreation.XMLCreator;

public class FakeXMLCreator extends XMLCreator {
    public String Expression;
    public String Filename;

    @Override
    protected String getExpression(){
        return this.Expression;
    }

    @Override
    protected String getFilename(){
        return this.Filename;
    }
}
