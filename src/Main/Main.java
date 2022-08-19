package Main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sanktionsliste SL = new Sanktionsliste();
        String input = SL.input();
        List<String> Sanktionsliste = SL.createSanktionsliste();
        Result result = SL.compare(input, Sanktionsliste);
        SL.output(input, result);
    }
}

