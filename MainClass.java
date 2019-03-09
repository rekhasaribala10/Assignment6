package Assignment6;

public class MainClass {

	public static void main(String[] args) {
		
		//Part A
		Mreview mreview = new Mreview("Kill Bill");
		mreview.addRating(3);
		mreview.addRating(4);
		mreview.addRating(3);
		
		System.out.println("Average Rating " + mreview.aveRating());
		System.out.print(mreview.toString());
		
		//Part B
		
		
		
		
		
		//Part C
		
		
		
		
		
		//Part D
		int[] inputArray = new int[]{1,10,40,100};
		int sampleInput = 30;
		PartD sampleD = new PartD();
		System.out.println("Nearest Index " + sampleD.returnClosest(inputArray, sampleInput));
		
		
		
		
	}

}
