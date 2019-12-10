import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(1, 7));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(7, 3));
        dominoes.add(new Domino(3, 5));
        dominoes.add(new Domino(5, 4));

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        List<ToDo> todos = new ArrayList<>();
        todos.add(new ToDo("Buy milk", "high", true));
        todos.add(new ToDo("Buy bread", "low", false));
        todos.add(new ToDo("Buy cheese", "low", false));
        todos.add(new ToDo("Make exercises", "high", true));
        todos.add(new ToDo("Sleep", "high", true));

        for (ToDo t : todos) {
            t.printAllFields();
        }
    }
}
