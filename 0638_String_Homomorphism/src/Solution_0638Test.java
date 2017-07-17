import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0638Test {

	Solution_0638 s = new Solution_0638();
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertNotNull(s);
	}
	
	@Test
	public void isIsomorphicTest(){
		assertFalse(s.isIsomorphic("","a"));
		assertFalse(s.isIsomorphic("aa", "ab"));
		assertTrue(s.isIsomorphic("egg", "add"));
		assertFalse(s.isIsomorphic("abc", "cdd"));
		assertTrue(s.isIsomorphic("", ""));
		assertFalse(s.isIsomorphic("foo", "bar"));
		assertTrue(s.isIsomorphic("paper", "title"));
	}
}
