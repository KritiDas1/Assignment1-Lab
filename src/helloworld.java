

import java.util.Scanner;

public class helloworld {


	    private String firstName;
	    private String lastName;
	    private String password;
	    private String department;
	    private String email;
	    private int defaultPasswordLength = 10;
	    private String companySuffix = "abc.com";

	    // Constructor to receive the first name and last name
	    public helloworld(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;


	        // Asking for the department - return the department
	        this.department = setDepartment();


	        // Method that returns a random password
	        this.password = randomPassword(defaultPasswordLength);
//	        System.out.println("\nYour Password is: " + this.password);

	        // Generate email
	        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;

	    }
	    // Ask for the department
	    private String setDepartment() {
	        System.out.print("Please enter the department from the following: "+ "\n" + "\n1 for Technical\n2 for Admin\n3 for Human Resources\n4 for Legal\n\n");
	        Scanner in = new Scanner(System.in);
	        int depChoice = in.nextInt();
	        if (depChoice == 1) { return "tech"; }
	        else if (depChoice == 2) {return "admin";}
	        else if (depChoice == 3) {return "human_resource";}
	        else {return "legal";}
	    }

	    //Password generator
	    private String randomPassword(int length) {
	        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
	        char [] password = new char[length];
	        for (int i=0; i<length; i++) {
	            int rand = (int) (Math.random() * passwordSet.length());
	            password[i] = passwordSet.charAt(rand);
	        }
	        return new String(password);
	    }
	    


	    	    public String getPassword() { return password; }

	    public String showInfo() {
	         System.out.println("Dear " + firstName + " your generated credentials are as follows " +
	                "\nEmail        ---> " + email +
	                "\nPassword ---> " + password);
	    return "Dear " + firstName + "your generated credentials are as follows " +
        "Email        ---> " + email +
        "Password ---> " + password;
	}
	public static void main(String[] args) {
	    helloworld em1 = new helloworld("Harshit", "Choudary");
	    em1.showInfo();

	}
}
		


