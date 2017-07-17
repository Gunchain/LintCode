import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0512Test {

	Solution_0512 s = new Solution_0512();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(s);
	}
	
	@Test
	public void numDecodingsTest(){
//		System.out.println('1' + 0);
//		System.out.println('2' + 0);
		System.out.println(s.numDecodings("12923"));
		assertTrue(s.numDecodings("10") == 1);
		assertTrue(s.numDecodings("") == 0);
		assertTrue(s.numDecodings("12") == 2);
		assertTrue(s.numDecodings("129") == 2);
		assertTrue(s.numDecodings("12923") == 4);
		assertTrue(s.numDecodings("02") == 0);
		assertTrue(s.numDecodings("30") == 0);
		assertTrue(s.numDecodings("2222") == 5);
	}

}
