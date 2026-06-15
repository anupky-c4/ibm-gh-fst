package fst;

public class car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	car(){
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("The colot of car: "+ color);
		System.out.println("Transmission of the car: "+ transmission);
		System.out.println("Car was manufactured in year:"+ make);
		System.out.println("The no of tyres: "+tyres);
		System.out.println("The no of doors: "+doors);
		
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}
}
