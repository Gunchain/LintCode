import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0061Test {

	Solution_0061 s = new Solution_0061();
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertNotNull(s);
	}
	
	@Test
	public void searchRangeTest(){
		int[] t1 = {3, 4, 5, 5, 7, 7, 8, 8, 8, 8, 10, 11, 12};
		assertTrue(s.searchRange(t1, 8)[0] == 6);
		assertTrue(s.searchRange(t1, 8)[1] == 9);
		assertTrue(s.searchRange(t1, 6)[0] == -1);
		assertTrue(s.searchRange(t1, 6)[1] == -1);
		assertTrue(s.searchRange(t1, 4)[0] == 1);
		int[] t2 = {1};
		assertTrue(s.searchRange(t2, 1)[0] == 0);
	}

}
