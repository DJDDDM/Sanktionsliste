package Main;
import Input.Inputhandler;

public class Sanktionsliste {

    public String input() {
        Input In = Inputhandler.getInstance();
        In.greeting();
        return In.getname();

    }
    public boolean compare(String a, String b) {
        return (a.equals(b)) ? true : false;
    }



    public void output (String name, boolean result) {
        if (result) System.out.println(name + " steht drauf");
        else System.out.println(name + " steht nicht drauf");

    }
}
