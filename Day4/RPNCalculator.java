package ssa;

import java.util.Stack;

public class RPNCalculator {


	public static void main(String[] args) {
		char[] problem = new char[] { '8', '2', '/', '9', '*', '1', '-', '7', '/' };
		Stack<Integer> stk = new Stack<Integer>();

		for (char ch:problem) {
			int nbr = Character.getNumericValue(ch);
			if (nbr != -1) {
				stk.push(nbr);
			} else {
				int p1 = stk.pop();
				int p2 = stk.pop();
				int pSolution;
				if (ch == '*') {
					pSolution = p1 * p2;
					stk.push(pSolution);
				} else if (ch == '/') {
					pSolution = p2 / p1;
					stk.push(pSolution);
				} else if (ch == '+') {
					pSolution = p1 + p2;
					stk.push(pSolution);
				} else if (ch == '-') {
					pSolution = p2 - p1;
					stk.push(pSolution);
				} 				
			} // end of if	
		} // end of for
		int ans = stk.pop();
	      System.out.printf("Answer is %d\n",ans);
	} // end of main
}
		
		
