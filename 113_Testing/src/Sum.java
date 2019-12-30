import java.util.ArrayList;

public class Sum {

    public int sum(ArrayList<Integer> arrayList) throws ListDoesNotExistException, ListIsEmptyException {
        if (arrayList == null) {
            throw new ListDoesNotExistException();
        } else if (arrayList.isEmpty()) {
            throw new ListIsEmptyException();
        }
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }
}
