package fst;

public class activity_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy b1= new Boy();
		Boy b2= new Boy();
		Boy b3= new Boy();
		Girl g1= new Girl();
		Girl g2= new Girl();
		Girl g3= new Girl();
		int humanPopulation=Boy.count+Girl.count;
		System.out.println("The human population :"+humanPopulation );
		Robot r1=new Robot();
		Robot r2=new Robot();
		Robot r3=new Robot();
		System.out.println("The robot population :"+Robot.count);
		

	}

}

class Human{
	void walking() {
		System.out.println("Human is walking.");
	}
	void talking() {
		System.out.println("Human is talking.");
	}
}

class Boy extends Human{
	static int count=0;
	Boy(){
		count++;
	}
}

class Girl extends Human{
	static int count=0;
	Girl(){
		count++;
	}
}

class Robot{
	static int count=0;
	Robot(){
		count++;
	}
	void walking() {
		System.out.println("Robot is walking.");
	}
	void talking() {
		System.out.println("Robot is talking.");
	}
}
