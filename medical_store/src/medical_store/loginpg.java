package medical_store;
import java.util.*;
public class loginpg {
	String username;
	String pass;
	Scanner scan=new Scanner(System.in);
	public void loginpage() {
		System.out.println("Enter User Name");
	    username=scan.nextLine();
	    System.out.println("Enter Password");
	    pass=scan.nextLine();
	    if(username=="Prathamesh Baxi" && pass=="password")
	    {
	    	System.out.println("************WELCOME******************");
	    }
	    else
	    {
	    	System.out.println("INVALID USERNAME OR PASSWORD");
	    }

	}
	}

