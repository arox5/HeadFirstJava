
public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"1a", "1b", "1c", "1d", "1e", "1f" };
		String[] wordListTwo = {"2a", "2b", "2c", "2d" };
		String[] wordListThree = {"3a", "3b", "3c", "3d", "3e" };
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " 
				+ wordListTwo[rand2] + " " 
				+ wordListThree[rand3];
		
		System.out.print(phrase);
		
	}
}
