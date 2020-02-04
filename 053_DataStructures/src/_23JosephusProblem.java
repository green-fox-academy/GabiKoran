import java.util.ArrayList;

public class _23JosephusProblem {
    public static void main(String[] args) {
        System.out.println(winningSeat(1));
        System.out.println(winningSeat(2));
        System.out.println(winningSeat(3));
        System.out.println(winningSeat(6));
        System.out.println(winningSeat(7));
        System.out.println(winningSeat(12));
        System.out.println(winningSeat(41));
        System.out.println(winningSeat(4));

    }

    public static int winningSeat(int numberOfPeople) {
        int index = -1;
        ArrayList<Integer> people = new ArrayList<>(numberOfPeople);
        for (int i = 1; i <= numberOfPeople; i++) {
            people.add(i);
        }

        boolean isEven = true;
        while (people.size() != 1) {
            int size = people.size();
            if (isEven) {
                for (int i = 1; i < people.size(); i++) {
                    people.remove(i);
                }
                isEven = ((size & 1) == 0);
            } else {
                for (int i = 0; i < people.size(); i++) {
                    people.remove(i);
                }
                isEven = ((size & 1) != 0);
            }
        }

        index = people.get(0);
        return index;
    }
}
