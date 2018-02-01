import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BinarySearchTest {

    @Test
    public void givenAnEmptyArraySearchReturnsNegative1() {
        int[] emptyArray = new int[0];
        assertEquals(-1, BinarySearch.search(1, emptyArray));
    }

    @Test
    public void givenAnArrayWithAMatchSearchReturns0() {
        int[] arr = new int[]{1};
        assertEquals(0, BinarySearch.search(1, arr));
    }

    @Test
    public void givenAnArrayWithOneElementThatDoesntMatchSearchReturnsNeg1() {
        int[] arr = new int[]{1};
        assertEquals(-1, BinarySearch.search(2, arr));
    }

    @Test
    public void givenAnArrayWithThreeElementsAndAMatchInIndex1ItReturns1() {
        int[] arr = new int[]{1,2,3};
        assertEquals(1, BinarySearch.search(2, arr));
    }

    @Test
    public void givenAnArrayWithThreeElementsAndMatchInLastIndexItReturns2() {
        int[] arr = new int[]{1,2,3};
        assertEquals(2, BinarySearch.search(3, arr));
    }

    @Test
    public void givenArrayWithThreeElementsAndMatchInFirstIndexItReturns0() {
        int[] arr = new int[]{1,2,3};
        assertEquals(0, BinarySearch.search(1, arr));
    }
}
