package Assignment6;

public class PartD {

	public int returnClosest(int[] inputArray , int number)
	{
		int distance = Math.abs(inputArray[0] - number);
		int index = 0;
		for(int i = 1; i < inputArray.length; i++){
		    int cdistance = Math.abs(inputArray[i] - number);
		    if(cdistance < distance){
		    	index = i;
		        distance = cdistance;
		    }
		}
		return index;
	}
	
	
}
