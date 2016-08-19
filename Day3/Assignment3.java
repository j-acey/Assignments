package simpleCraps;

public class Assignment3 {
	long seed = (new java.util.Date()).getTime();
	java.util.Random rnd = new java.util.Random(seed);


	public static void main(String[] args) {

		Assignment3 assignment3 = new Assignment3();
		
		assignment3.Rules(assignment3.RandomValues());

	}

	public void Rules(int point1) {

		if (point1 == 7) {
			System.out.printf("Lucky %d, congratulations you win!", point1);
		} else if (point1 == 2 || point1 == 3 || point1 == 12) {

			System.out.printf("Too bad you crapped out with %d, sorry you lose!", point1);

		} else {
			// Point Established
			System.out.println("Your point is " + point1 +"\n");
			// Roll Again
			int point2 = RandomValues();

			while  (true) {

				if (point2 == point1) {
					System.out.printf("%d, Great you hit your point, congratulations you win!", point2);
					break;
				}
				if (point2 == 7) {
					System.out.printf("%d, You lose, too bad this wasn't your first roll!", point2);
					break;
				}
				// Now keep rolling
				point2 = RandomValues();

			}
		}

	}

	public int RandomValues() {
		// First Roll
		int die1 = rnd.nextInt(6) + 1;
		System.out.printf("Die1 rolled a %d\n", die1);

		int die2 = rnd.nextInt(6) + 1;
		System.out.printf("Die2 rolled a %d\n\n", die2);

		int point1 = die1 + die2;
		System.out.println("Your total is " + point1 +"\n");
		return point1;
		}

}
