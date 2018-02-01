import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BinarySearchTest {

    @Test
    public void givenAnEmptyArraySearchReturnsNegative1() {
        int[] emptyArray = new int[0];
        assertEquals(-1, BinarySearch.search(1, emptyArray));
    }


}
