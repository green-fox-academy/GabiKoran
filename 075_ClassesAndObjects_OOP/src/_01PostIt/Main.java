package _01PostIt;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"
        PostIt Idea1 = new PostIt(Color.orange, "Idea 1", Color.blue);
        PostIt Awesome = new PostIt(Color.pink, "Awesome", Color.black);
        PostIt Superb = new PostIt(Color.yellow, "Superb!", Color.green);

        print(Idea1);
        System.out.println();
        print(Awesome);
        System.out.println();
        print(Superb);
    }

    public static void print (PostIt name) {
        System.out.println(name.backgroundColor);
        System.out.println(name.text);
        System.out.println(name.textColor);
    }
}
