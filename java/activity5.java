package fst;

public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title= "The Alchemist";
		Book newone= new MyBook();
		newone.setTitle(title);
		System.out.println("The title is :"+ newone.getTitle());
	}

}

abstract class Book{
	String title;
	abstract void setTitle(String title);
	String getTitle(){
		return title;
	}
	
}

 class MyBook extends Book{
	 public void setTitle(String title){
		 this.title=title;
	 }
 }
