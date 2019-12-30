import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Sum sum = new Sum();
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            sum.sum(arrayList);
        } catch (ListDoesNotExistException e) {
            //e.printStackTrace();
        } catch (ListIsEmptyException e) {
            //e.printStackTrace();
        }
    }
}
