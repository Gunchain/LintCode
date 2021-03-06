
public class Solution_0512 {
	/**
     * @param s a string,  encoded message
     * @return an integer, the number of ways decoding
     */
    public int numDecodings(String s) {
        int p = 1;
        int pp = 1;
        if (s.length() == 0 || s.charAt(0) == '0')
        	return 0;
    	for(int i = 1; i < s.length(); i ++){
    		int cur = p;
    		if (s.charAt(i) == '0'){
    			if(s.charAt(i - 1) > '2')
    				return 0;
    			p = pp;
    			pp = 0;
    			
    		} else if ((s.charAt(i) - '0') + 10 * (s.charAt(i-1) - '0') < 27){
    			cur = pp + p;
    			pp = p;
    			p = cur;
    		} else {
    			pp = p;
    		}

        }
        return p;
    }
}
