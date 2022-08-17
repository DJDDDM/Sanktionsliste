package Main;

public class Main {
    public static void main(String[] args) {
        Sanktionsliste SL = new Sanktionsliste();
        String input = SL.input();
        Boolean result = SL.compare(input, "Putin");
        SL.output(input, result);

    }


}

