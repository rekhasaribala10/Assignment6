package Assignment6;

public class Pet {

	private String PetName;
	private String OwnerName;
	private String color;
	private String sex;
	protected final String[] sexArray = new String[] { "male", "female", "spayed", "neutered" };

	public Pet(String PetName, String OwnerName, String color) {
		this.PetName = PetName;
		this.OwnerName = OwnerName;
		this.color = color;
	}

	String getPetName() {
		return getPetName();
	}

	String getOwnerName() {
		return getOwnerName();
	}

	String getColor() {
		return getColor();
	}

	void setSex(int sexid) {
		this.sex = sexArray[sexid];
	}

	String getSex() {
		return sex;
	}

	public String toString() {
      return PetName + " owned By " +  OwnerName + System.lineSeparator() + 
    		  "Color: " + color + System.lineSeparator() + "Sex: " + sex;
	}
	
	public static void main(String[] args)
    {
		Pet pet = new Pet("Spot","Mary","Black and White");
		pet.setSex(0);
		System.out.println(pet.toString());
    }
	

}
