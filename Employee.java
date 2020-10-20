public class Employee {
		String ename;
		String city;
		int age;
		public void display() {
			System.out.println("The name is:"+ename);
			System.out.println("The city is:"+city);
			System.out.println("The age is:"+age);
		}
		public static void main(String args[]) {
			Employee e=new Employee();
			Employee e1=new Employee();
			e.ename="Shanthi";
			e.city="Kply";
			e.age=25;
			e1.ename="Abhi";
			e1.city="Ekm";
			e1.age=27;
			e.display();
			e1.display();
					
		}



	}
