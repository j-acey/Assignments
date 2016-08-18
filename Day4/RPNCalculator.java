package ssa;

import java.util.Stack;

public class RPNCalculator {

/*	int nbr1 = 8;
	int nbr2 = 5;
	int result = nbr1 + nbr2;
	char minus = '-';
	char plus = '+';
	char multiply = '*';
	char divide = '/';*/

	
	



//	static void showpush(Stack st, int a) {
//	      st.push(new Integer(a));
//	      System.out.println("push(" + a + ")");
//	      System.out.println("stack: " + st);
//	   }
//
//	static void showpop(Stack st) {
//	      System.out.print("pop -> ");
//	      Integer a = (Integer) st.pop();
//	      System.out.println(a);
//	      System.out.println("stack: " + st);
//	}


	public static void main(String[] args) {
		char[] problem = new char[] { '8', '5', '+' };
		Stack<Integer> stk = new Stack<Integer>();

		for (char ch:problem) {
			int nbr = Character.getNumericValue(ch);
			if (nbr != -1) {
				stk.push(nbr);
			} else {
				if (ch == '+') {
					int p1 = stk.pop();
					int p2 = stk.pop();
					int pTotal = p1 + p2;
					stk.push(pTotal);
				}
			} //if 
		}
		int ans = stk.pop();
	      System.out.printf("Calculating 8,5+. Answer is %d",ans);

		
		
		
		
//		for(int i = 0; i < problem.length;i++) {
//			int k = (problem.length-1)-i;
//			showpush(stk , problem[k]);
		}
		
		
		
		}

		
	


	 
	  	//int anInt = (int) stk.pop();

	      
	      
	      
	      
	      
	      
	      
	      
	      
	 

