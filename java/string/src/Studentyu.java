
public class Studentyu {

	int a;
	Student s;
	int getA(){
		
		return a;
		
	}
	
	Student getStudent(){
		s=new Student();
		return s;
	}
	
	void setStudent(Student ss){
		System.out.println(ss.fees);
		System.out.println(ss.id);
		System.out.println(ss.name);
		
		ss.fees=1234;
		System.out.println(ss.fees);
		
	}
	
	public static void main(String[] args) {
		
		Studentyu d=new Studentyu();
		Student s=new Student("a",123,12);
		d.setStudent(s);
		
		
	}
	
}
