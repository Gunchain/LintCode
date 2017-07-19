import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0028Test {

	Solution_0028 s = new Solution_0028();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(s);
	}
	
	@Test
	public void searchMatrixTest(){
		int[][] a = new int[2][3];
		
		a[0][0] = 0;
		a[0][1] = 1;
		a[0][2] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;
		
		assertTrue(s.searchMatrix(a, 0));
		assertTrue(s.searchMatrix(a, 1));
		assertFalse(s.searchMatrix(a, 8));
	}

}
