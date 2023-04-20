import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedShortArray() {
    int[] input1 = {1,2,3 };
    assertArrayEquals(new int[]{3,2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLongArray() {
    int[] input1 = {1,2,3,4,5,6,7,8,9,10 };
    assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1),0.00001);
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = {0.1,0.2,0.3,0.4};
    assertEquals(0.3, ArrayExamples.averageWithoutLowest(input1),0.00001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {1,1,2};
    assertEquals(1.5, ArrayExamples.averageWithoutLowest(input1),0.00001);
  }
  

  
}
