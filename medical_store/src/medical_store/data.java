package medical_store;
import java.util.*;
public class data {
	
	String name[];
	String a[];
	int quant[];
	float amt[];
	//we have to use HASHMAP for alternateive medicines
		Scanner scan=new Scanner(System.in);
		int t;
		public void getdata()
		{
		System.out.println("Enter total med");
		t=scan.nextInt();
		name=new String [t];
		quant=new int[t];
		amt=new float[t];
		a = new String[t];
		int i=0;
		
		
		for(i=0;i<t;i++)
		{
		System.out.println("Enter drug name");
		name[i]=scan.next();
		System.out.println("Enter Available quantity");
		quant[i]=scan.nextInt();
		System.out.println("Enter price per drug");	
		amt[i] = scan.nextFloat();
		
	}
		
	}
		public void display()
		{int i=0;
			for(i=0;i<t;i++)
			{System.out.println("Drug name :"+" "+name[i]);
			System.out.println("Available quantity :"+" "+ quant[i]);
			System.out.println("Price per drug: "+" "+amt[i]);
			
			}
			
		}
		
}


