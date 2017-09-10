/**
 *4 kyu Sudoku Solution Validator
 *
 *Algorithm:
 *	1. Construct a loop for row and column of the two dimensional array
 *	2. 
 */
public class SudokuValidator {
    public static boolean check(int[][] s) {
        boolean a = true;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				for(int k = j+1; k<s[i].length-1; k++) {
					if(s[i][k]==s[i][j] || s[i][k]==0) {
						a = false;
					}
				}
			}
		}
		return a;
	}
}
