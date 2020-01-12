package medical_store;
import java.util.*;
public class buy extends data {
	data d=new data();
	String usrname;
	float usrquant;
	int flag =0;
	public void userdata()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Required Drug Name:");
		usrname=scan.next();
		
		System.out.println("Enter Required Quantity of"+" "+usrname);
		usrquant=scan.nextFloat();
		
	}
	public void cal()
	{	int i = 0;
		if(usrname.equals(super.name))
		{
			System.out.println("AVailable");
			flag =i;
		}
		System.out.println("Total price :"+(usrquant*super.amt[i]));
		}
	
	public void updatedata()
	{int i=0;
		System.out.println("CONFORM PURCHASE Y/N");
		System.out.println("Total price :"+(usrquant*d.amt[0]));
	   super.quant[i]=(int)(usrquant - super.quant[i]);//reduced quantity after buying the drug
		System.out.println("************NEW DATA*****************");
	   for(i=0;i<d.t;i++)
	    {
		   System.out.println("Drug name :"+" "+name[i]);
			System.out.println("Available quantity "+" "+ quant[i]);
			System.out.println("Price per drug"+" "+amt[0]);
	    }
		
	}
	int temp=flag;//I DONT KNOW WHY IAM DOOING THIS !!

}



