package Assignment6;

import java.util.Date;

public class Dog extends Pet implements Boardable {

	private String size;
	
	private Date boardingStartDate;

	private Date boardingEndDate;
	
	public Dog(String PetName, String OwnerName, String color, String size) {
		super(PetName, OwnerName, color);	
		this.size = size;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public String toString() 
	{
		String s = "";
		s = "DOG: " + System.lineSeparator();
		s = s + super.toString() + System.lineSeparator();
		s= s + "Size: " + size;
		return s;
		
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		boardingStartDate = new Date(year,month,day);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		boardingEndDate = new Date(year,month,day);
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Date presetDate = new Date(year,month,day);
		return presetDate.before(boardingEndDate) && presetDate.after(boardingStartDate);
	} 
	
	
	public static void main(String[] args)
    {
		Dog dog = new Dog("Spot","Susan","white","medium");
		dog.setSex(2);
		System.out.println(dog.toString());
		dog.setBoardStart(1, 1, 2017);
		dog.setBoardEnd(1, 1, 2020);
		System.out.print(dog.boarding(1, 1, 2018));
    }
	
	

}
