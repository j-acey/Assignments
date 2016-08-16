package simpleDice;

public class SimpleDice {

	

	public static void main (String[] args){
		
		int totalScore = 0;
		
		long seed = (new java.util.Date()).getTime();
		java.util.Random rnd = new java.util.Random(seed);
		
		int die = rnd.nextInt(6)+1;
		System.out.printf("value of the die is %d\n", die);
		
		

		while(die != 1) {
			totalScore = totalScore + die; 
			die = rnd.nextInt(6)+1;
			
		}		
		System.out.printf("value of the totalscore is %d", totalScore);

	}
	
}

