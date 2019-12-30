import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    private Sum sumObject;
    private ArrayList<Integer> arrayList1;  // instantiate fields
    private ArrayList<Integer> arrayList2;
    private ArrayList<Integer> arrayList3;

    @Before
    public void init() throws Exception {
        sumObject = new Sum();
        arrayList1 = new ArrayList<Integer>();  // initialize them
        arrayList2 = new ArrayList<Integer>();
        arrayList3 = new ArrayList<Integer>();
    }

    @Test
    public void sumShouldReturnSumOfTheElementsCorrectly() throws ListDoesNotExistException, ListIsEmptyException {
        for (int i = 0; i < 10; i++) {
            arrayList1.add(i + 1);
        }
        for (int i = 2; i < 10; i++) {
            arrayList2.add(i);
        }
        for (int i = -5; i < 6; i++) {
            arrayList3.add(i);
        }

        assertEquals(55, sumObject.sum(arrayList1));
        assertEquals(44, sumObject.sum(arrayList2));
        assertEquals(0, sumObject.sum(arrayList3));
    }

    @Test (expected = ListIsEmptyException.class)
    public void sum_Should_ThrowException_WhenEmptyArrayListWasGiven() throws ListDoesNotExistException, ListIsEmptyException {
        sumObject.sum(arrayList1);
    }

    @Test (expected = ListDoesNotExistException.class)
    public void sum_Should_ThrowException_WhenListDoesNotExist() throws ListDoesNotExistException, ListIsEmptyException {
        sumObject.sum(null);
    }

    @Test
    public void sum_Should_ReturnElementValue_WhenListHasOnlyOneElement() throws ListIsEmptyException, ListDoesNotExistException {
        arrayList1.add(10);
        arrayList2.add(4);

        assertEquals(10, sumObject.sum(arrayList1));
        assertEquals(4, sumObject.sum(arrayList2));
    }
}