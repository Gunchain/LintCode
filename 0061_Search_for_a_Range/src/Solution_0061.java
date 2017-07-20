
public class Solution_0061 {

	/** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
    	int[] re = {-1, -1};
    	if (A.length == 0 || target < A[0] || target > A[A.length - 1])
    		return re;
    	int l = 0;
    	int r = A.length - 1;
    	int m = 0;
    	int rt = A.length;
    	while (l <= r){
    		m = (r + l) / 2;
    		if (A[m] < target)
    			l = m + 1;
    		else {
    			if (A[m] > target && m < rt)
    				rt = m;
    			r = m - 1;
    		}
   		}
    	if (A[r + 1] != target)
    		return re;
    	re[0] = r + 1;
    	l = re[0];
    	r = rt - 1;
    	while (l <= r){
    		m = (l + r) / 2;
    		if (A[m] > target){
    			r = m - 1;
    		} else {
    			if (re[1] < m)
    				re[1] = m;
    			l = m + 1;
    		}
    	}
    	if (re[1] + 1 < A.length &&  A[re[1] + 1] == target)
    		re[1] ++;
    	return re;
    }
}
