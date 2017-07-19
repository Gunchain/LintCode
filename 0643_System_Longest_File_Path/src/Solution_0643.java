import java.util.ArrayList;

public class Solution_0643 {
	/**
     * @param input an abstract file system
     * @return return the length of the longest absolute path to file
     */
    public int lengthLongestPath(String input) {
        // Write your code here
    	if (input.length() == 0 || input.startsWith("\n"))
    		return 0;
    	ArrayList<Integer> lp = new ArrayList<>();
    	String[] s = input.split("\n");
    	if (s.length == 1)
    		return 0;
    	lp.add(s[0].length());
    	int idx = 0;
    	int max = lp.get(lp.size() - 1);
    	for (int i = 1; i < s.length; i ++){
    		
    		int ct = 1;
    		while (s[i].substring(0, ct).endsWith("\t")){
    			ct ++;
    		}
    		if (--ct > idx + 1)
    			return 0;
    		idx = ct;
    		if (idx == 0)
    			lp.set(idx, s[i].length());
    		else if (idx < lp.size())
    			lp.set(idx, s[i].length() - ct + 1 + lp.get(idx - 1));
    		else
    			lp.add(s[i].length() - ct + 1 + lp.get(idx - 1));
    		if (s[i].contains(".") && lp.get(idx) > max)
    			max = lp.get(idx);
    	}
    	return max;
    }
}
