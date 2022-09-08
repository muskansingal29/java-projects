package oops;

public class Student {

	
		
		
		public Student() {
		// TODO Auto-generated constructor stub
	}
		@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
		public static String institudeName = "ANUDIP ";
		 public static String getInstitudename() {
			return institudeName;
		}
		public static void setInstitudename(String institudename) {
			institudeName = institudename;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		private int rollno;
		 private String name;
		 private int age;
		

}



 
	
