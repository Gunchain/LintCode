import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0062Test {

	Solution_0062 s = new Solution_0062();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(s);
	}

	@Test
	public void searchTest(){
		int[] t = {4, 5, 1, 2, 3};
		assertTrue(s.search(t, 0) == -1);
		assertTrue(s.search(t, 1) == 2);
		assertTrue(s.search(t, 2) == 3);
		assertTrue(s.search(t, 3) == 4);
		assertTrue(s.search(t, 4) == 0);
		assertTrue(s.search(t, 5) == 1);
		int[] t2 = {0, 1, 2, 3, 4, 5, 6};
		assertTrue(s.search(t2, 0) == 0);
		assertTrue(s.search(t2, 1) == 1);
		assertTrue(s.search(t2, 2) == 2);
		assertTrue(s.search(t2, 3) == 3);
		assertTrue(s.search(t2, 4) == 4);
		assertTrue(s.search(t2, 5) == 5);
		assertTrue(s.search(t2, 6) == 6);
		assertTrue(s.search(t2, 7) == -1);
	}
}
