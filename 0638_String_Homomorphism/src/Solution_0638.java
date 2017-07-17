import java.util.HashMap;
import java.util.HashSet;

public class Solution_0638 {

	/**
     * @param s a string
     * @param t a string
     * @return true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> st = new HashMap<Character, Character>();
        HashSet<Character> cot = new HashSet<Character>();
        if (s.length() != t.length())
        	return false;
        for(int i = 0; i < s.length(); i ++){
        	if (st.containsKey(s.charAt(i)) && !st.get(s.charAt(i)).equals(t.charAt(i))){
        		return false;
        	} else if (!st.containsKey(s.charAt(i)) && cot.contains(t.charAt(i)))
        		return false;
        	else if (!st.containsKey(s.charAt(i)) && !cot.contains(t.charAt(i))){
        		st.put(s.charAt(i), t.charAt(i));
        		cot.add(t.charAt(i));
        	}
        }
        return true;
    }
}
