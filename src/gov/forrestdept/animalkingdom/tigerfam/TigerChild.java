package gov.forrestdept.animalkingdom.tigerfam;

public class TigerChild extends TigerParent {
	public void animalBreed() {
		super.animalBreed();
		System.out.println("The Child Tiger is a Cross Asian Breed");
	}
	public void animalHealth() {
		super.animalHealth();
		System.out.println("The Child Tiger is young and Healthy");
	}

	public static void main(String[] args) {
		TigerChild tiger1 = new TigerChild();
		tiger1.parentColor(animal,color);
		tiger1.animalBreed();
		TigerChild tiger2 = new TigerChild();
		tiger2.animalHealth();
			
		

	}

}
