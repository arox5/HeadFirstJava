
public class TestArray {
	public static void main (String [] args) {
		int [] numList = {1, 6, 3, 9, 2};
		
		int [] numList2 = new int[4];
		System.out.println("numList2: " + numList2.length);
		System.out.println();
		
		for (int i=0; i<numList.length; i++) {
			System.out.println(i + ": " + numList[i]);
		}
		
		System.out.println();
		
		Dog [] dList = new Dog[3];
		
		dList[1] = new Dog();
		dList[1].name = "Jacky";

		for (int i=0; i<dList.length; i++) {
			//System.out.println(dList.getClass().getName());
			
			if(dList[i] != null) {
				System.out.println(i + ": " + dList[i].name);
			}

		}
	}

}

