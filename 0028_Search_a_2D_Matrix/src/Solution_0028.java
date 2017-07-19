
public class Solution_0028 {

	 /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
    	if (matrix.length == 0 || matrix[0].length == 0)
    		return false;
    	int l = 0;
    	int r = matrix.length - 1;
    	int fr = 0;
    	while (r >= l){
    		fr = (l + r) / 2;
    		if (matrix[fr][0] > target)
    			r = fr - 1;
    		else if (matrix[fr][matrix[fr].length - 1] < target)
    			l = fr + 1;
    		else
    			break;
    		
    	}
    	if (matrix[fr][0] > target || matrix[fr][matrix[fr].length - 1] < target)
    		return false;
    	l = 0;
    	r = matrix[fr].length - 1;
    	int fc = 0;
    	while (r >= l){
    		fc = (r + l) / 2;
    		if (matrix[fr][fc] < target)
    			l = fc + 1;
    		else if (matrix[fr][fc] > target)
    			r = fc - 1;
    		else 
    			return true;
    	}
    	return false;
    }
}
