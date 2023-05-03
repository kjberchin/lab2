import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {55};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{55}, input1);
	}

  @Test
  //succesfully reverses the first half of the list however leaves the second half unaltered because when it reaches index 2
  // it will not because it already reversed and updated at the first two indecies.  
  public void testReversedInPlace2() {
    int [] input2 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input2);
  }
  


  // @Test
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }

  // @Test
  // public void testReversed2() {
  //   int[] input2 = {1, 2, 3, 4};
  //   assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input2));
  // }

  // @Test
  // public void testAverageWithoutLowest(){
  //   double[] input1 = {10, 3, 3, 4};
  //   assertEquals(7.0, ArrayExamples.averageWithoutLowest(input1), 0.0 );
  // }
}
