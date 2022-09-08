package oops;



public class StudentMain {

	public static void main(String[] args) {
		Student s1 =new Student();
		{
		s1.setInstitudename ("TCS");
		s1.setRollno(101);
		s1.setName("MUSKAN");
		s1.setAge(20);
		
		System.out.println(s1.getInstitudename());
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		}
		Student s2 =new Student();
		{	
		s2.setInstitudename (" ANUPID");
		s2.setRollno(102);
		s2.setName("ANJALI");
		s2.setAge(21);
		
		System.out.println(s2.getInstitudename());
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
			
		}
		Student s3 =new Student();
		{	
		s3.setInstitudename ("OVLIV E  EDUCAION");
		s3.setRollno(103);
		s3.setName("POOJA");
		s3.setAge(22);
		
		System.out.println(s3.getInstitudename());
		System.out.println(s3.getRollno());
		System.out.println(s3.getName());
		System.out.println(s3.getAge());		
	}
}
}

