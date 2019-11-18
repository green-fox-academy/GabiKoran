package _01PostIt;

import java.awt.*;

public class PostIt {
//    a backgroundColor
//    a text on it
//    a textColor
    Color backgroundColor;
    String text;
    Color textColor;

    public PostIt(Color backgroundColor, String text, Color textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public PostIt() {
    }
}
