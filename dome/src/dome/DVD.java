package dome;

public class DVD extends Item {
	private String director="";
	

	public DVD(String title, String dir) {
		super(title);
		director = dir;
	}
	
	public void print(){
		super.print();
		System.out.println(director);
	}
	
}
