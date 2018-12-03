class Employee{
	public String name;
	public int age;
	Employee(String nameis){
		name = nameis;
		System.out.println("This is the constructor of Employee");
	}

	public void set_name(String nameis){
		name = nameis;
	}

	public void set_age(int ageis){
		age = ageis;
	}

	public void display_details(){
		System.out.println(name+" is an employee of our company and her age is: "+age);
	}
}


public class Employeetasks extends Employee{
	public String emproject;
	public int projectID;
	
	Employeetasks(){
		super("sdf");
		System.out.println("This is the constructor of Employeetasks");	
	}

	public void set_name(String nameis){

		name = nameis+"!!";
	}

	public static void main(String[] args){
		Employee emptsk = new Employeetasks();
		emptsk.set_name("Rasika");
		emptsk.set_age(32);
		//emptsk.emproject = "Engati";
		//emptsk.projectID = 32091325;
		System.out.println(emptsk.name + "  is an emplaoyee aged : "+emptsk.age);
		//System.out.println(emptsk.name+" an employee with Id:/* "+emptsk.projectID+"and is working on the project: "+emptsk.emproject);

	}
}




