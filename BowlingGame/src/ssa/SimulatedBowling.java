package ssa;

public class SimulatedBowling {

	long seed = (new java.util.Date()).getTime();
	java.util.Random rnd = new java.util.Random(seed);
	
	int getPinsKnockedDown() {
		int aBall = rnd.nextInt(11);
		return aBall;
	} 
 
    public int bowlingScores[][] = new int[3][10];
    public int seriesTotal;
    
    
    public int bowlOneFrame(int frameNbr) {
    	int secondBall = 0;
    	int firstBall = getPinsKnockedDown();
    	if (firstBall < 10) {
    		secondBall = getPinsKnockedDown();
    	}
    	int totalPins = firstBall + secondBall;
    	if(totalPins > 10) {
    		return 10;
    	} else { 
    		return totalPins;
    	}
    	
    	  	
    } 
    
    public void bowlOneGame(int gameNbr) {
    	int gameTotal = 0;
		System.out.printf("Game %d" , gameNbr+1);

    	for(int idx = 0; idx < 10; idx++) {
    		int nbrFrame = idx + 1;
    		int nbrPins = bowlOneFrame(nbrFrame);
    		bowlingScores[gameNbr][idx] = nbrPins;
    		gameTotal += nbrPins;
    		
    		System.out.printf("%4d " , nbrPins);
    	}
    	seriesTotal += gameTotal;
    	System.out.printf("%5d ", gameTotal);
    	System.out.println();
    }
    
    public void printSeriesTotal() {
    	System.out.println("Total Series" + "                                              " + seriesTotal);
    }
    
    public void fullSeries() {
    	System.out.println("Frame    1    2    3    4    5    6    7    8    9   10  Total" );
    	for(int game = 0; game < 3; game++) {
    		bowlOneGame(game);
    	}
    	printSeriesTotal();
    	
    }
}   		
    		
    		
    		
//    		
//    		for (int idx = 0; idx < 10; idx++) {
//    			bowlingScores[game][frame] = bowlOneFrame();
//    		}
    	
    

	
	


