package project;

public class Manager {
	int id;
	String name;
	String address;
	double salary;
	String jobTitle;
	
		String projects;

		public Manager(int id, String name, String address, double salary, String jobTitle,String projects) {
			this.id=id;
			this.name=name;
			this.address = address;
			this.salary = salary;
			this.jobTitle = jobTitle;
			this.projects = projects;
			
		}
		public void work() {
			 System.out.println("Managing Projects");
			 
		 }

	}


