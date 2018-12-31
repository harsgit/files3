package lab3_7;

public class FullName {
	private String lastName;
	private String firstName;
	private char gender;
	private int age;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	FullName() {
		this("Divya", "Bharathi", 'F', 22);
	}

	public FullName(String firstName, String lastName, char gender, int age) {

		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.age = age;
		System.out.println("Personal Details");
		System.out.println("-----------------");
		System.out.println("First Name :" + " " + firstName);
		System.out.println("Last Name :" + " " + lastName);
		System.out.println("Gender :" + " " + gender);
		System.out.println("Age:" + " " + age);

	}

	public void fullName() {
		String s = " ";

		s = firstName.concat(lastName);
		System.out.println("Full Name is"+s);

	}

}
