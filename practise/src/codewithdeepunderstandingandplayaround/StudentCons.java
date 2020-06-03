package codewithdeepunderstandingandplayaround;

public class StudentCons {

	  
	int studentno;
	String studentname;
	int studentage;

//	public StudentCons(int studentno,String studentname,int studentage){
//	
	//here initialization is not done of class instance variables so 
	//output for student object with studentno will be 0 
 //for student name is nulll and student age will be 0
//
//	}
	
	public StudentCons(int studentno,String studentname,int studentage){
		this.studentno= studentno;
		this.studentname= studentname;
		this.studentage= studentage;
		
	}
	
	// a constructor can have return type but cannot have the static , final keywords
	//  can have private 
	public StudentCons() {
		
		
		System.out.println("default cons");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		StudentCons st1=new StudentCons(21,"puneet", 31);
		StudentCons st2=new StudentCons();
		
		System.out.println(st1.studentname);
		System.out.println(st1.studentno);
		System.out.println(st1.studentage);
	
	}

}
