package Assignment6;

import java.util.Date;

public class Cat extends Pet implements Boardable {

	private String hairLength;

	private Date boardingStartDate;

	private Date boardingEndDate;

	public Cat(String PetName, String OwnerName, String color, String hairLength) {
		super(PetName, OwnerName, color);
		this.hairLength = hairLength;
	}

	public String getHairLength() {
		return hairLength;
	}

	public String toString() {
		String s = "";
		s = "CAT: " + System.lineSeparator();
		s = s + super.toString() + System.lineSeparator();
		s = s + "HairLength: " + hairLength;
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

	public static void main(String[] args) {
		Cat cat = new Cat("Tom", "Bob", "Black and White", "short");
		cat.setSex(2);
		System.out.println(cat.toString());
		cat.setBoardStart(1, 1, 2017);
		cat.setBoardEnd(1, 1, 2020);
		System.out.print(cat.boarding(1, 1, 2022));
	}

}
