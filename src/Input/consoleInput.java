package Input;

import Main.Input;

import java.util.Scanner;

public class consoleInput implements Input {
    @Override
    public void greeting() {
        System.out.println("Gesucht?");
    }

    @Override
    public String getname() {
        Scanner reader = new Scanner(System.in);
        return reader.next();
    }
}
