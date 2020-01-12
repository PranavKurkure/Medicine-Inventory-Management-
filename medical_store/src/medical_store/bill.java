package medical_store;
import java.util.*;
public class bill extends buy{
	data d=new data();
	buy b=new buy();
	public void printbill() {
		System.out.println("******************BILL********************");
		System.out.println("DRUG NAME : "+b.usrname);
		System.out.println("Quantity : "+b.usrquant);
		System.out.println("Totla AMOUNT : "+(usrquant*d.amt[temp]));
		System.out.println("******************THANK YOU********************");
	}
}
