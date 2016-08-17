package simpleCraps;

public class Assignment3 {
	long seed = (new java.util.Date()).getTime();
	java.util.Random rnd = new java.util.Random(seed);


	public static void main(String[] args) {

		Assignment3 assignment3 = new Assignment3();
		assignment3.RandomValues();

		assignment3.Rules();

	}

	public void Rules() {
		int point1 = RandomValues();

		if (point1 == 7) {
			System.out.println("Winner");
		} else if (point1 == 2 || point1 == 3 || point1 == 12) {

			System.out.printf("Your point is %d, sorry you lose!", point1);

		} else {

			int point2 = RandomValues();

			while  (true) {

				if (point2 == point1) {
					System.out.println("Winner");
					break;
				}
				if (point2 == 7) {
					System.out.println("Loser");
					break;
				}
				// while (point2 != point1 || point2 !=7) {
				// RandomValues();
				// }
				point2 = RandomValues();

			}
		}

	}

	public int RandomValues() {
		
		int die1 = rnd.nextInt(6) + 1;
		int die2 = rnd.nextInt(6) + 1;
		int point1 = die1 + die2;

		return point1;
	}

}

//
// long seed = (new java.util.Date()).getTime();
// java.util.Random rnd = new java.util.Random(seed);
//
// int die1 = rnd.nextInt(6)+1;
//// System.out.printf("value of the die1 is %d\n", die1);
//
// int die2 = rnd.nextInt(6)+1;
//// System.out.printf("value of the die2 is %d\n", die2);
//
//
//
// if (point1 ==2 || point1 ==3 || point1 == 12) {
//
// System.out.printf("Your score is %d, sorry you lose!", point1);
//
// }
//
//
// if (point1 ==7) {
//
// System.out.printf("Your score is %d, congratulations you win!", point1);
//
// } else {
//
//
//
// }
