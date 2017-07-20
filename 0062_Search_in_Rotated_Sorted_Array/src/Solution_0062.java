
public class Solution_0062 {
	/** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
    	if (A.length == 0)
    		return -1;
    	int l = 0;
    	int r = A.length - 1;
    	int m = 0;
    	while (l <= r){
    		m = (l + r) / 2;
    		if (A[m] == target)
    			return m;
    		else if (A[m] > target){
    			if (A[m] < A[r])
    				r = m - 1;
    			else{
    				if (A[l] > target)
    					l = m + 1;
    				else if (A[l] < target){
    					r = m - 1;
    					l ++;
    				}
    				else 
    					return l;
    			}
    		} else {
    			if (A[m] > A[l])
    				l = m + 1;
    			else {
    				if (A[r] > target){
    					l = m + 1;
    					r --;
    				} else if (A[r] < target)
    					r = m - 1;
    				else 
    					return r;	
    			}
    		}
    	}
    	return -1;
    }
}
