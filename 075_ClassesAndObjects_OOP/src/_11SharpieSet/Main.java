package _11SharpieSet;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Sharpie yellow = new Sharpie("yellow", 10);
        Sharpie orange = new Sharpie("orange", 10);
        Sharpie pink = new Sharpie("pink", 10);
        Sharpie purple = new Sharpie("purple", 10);
        Sharpie blue = new Sharpie("blue", 10);
        Sharpie green = new Sharpie("green", 10);

        SharpieSet coloredPens = new SharpieSet();
        coloredPens.nameSharpieSet.add(yellow);
        coloredPens.nameSharpieSet.add(orange);
        coloredPens.nameSharpieSet.add(pink);
        coloredPens.nameSharpieSet.add(purple);
        coloredPens.nameSharpieSet.add(blue);
        coloredPens.nameSharpieSet.add(green);

        print(coloredPens); // check
        printUsableNumbers(coloredPens);

        for (int i = 0; i < 100; i++) {
            blue.use();
        }
        printUsableNumbers(coloredPens);

        coloredPens.removeTrash();
        print(coloredPens); // check
        printUsableNumbers(coloredPens);
    }

    public static void print(SharpieSet name) {
        System.out.println("These sharpie(s) I have: ");
        for (int i = 0; i < name.nameSharpieSet.size() -1; i++) {
            System.out.print(name.nameSharpieSet.get(i).color + ", ");
        }
        System.out.println(name.nameSharpieSet.get(name.nameSharpieSet.size()-1).color);
        System.out.println();
    }

    public static void printUsableNumbers(SharpieSet name) {
        System.out.println(name.countUsable() + " sharpies are usable.\n");
    }
}
