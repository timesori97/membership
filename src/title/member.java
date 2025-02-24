package title;

public class member {
	String id;
	String name;
	String addr;
	boolean age=false;
	String [] hobby =new String [5];
	String [][]memo=new String[2][10];

	member(String id, String name, String addr , int student) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		if(student==1) {
			age=true;
		}
		

	}

}