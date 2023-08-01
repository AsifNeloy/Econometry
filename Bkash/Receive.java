package Bkash;
import java.io.*;
import java.util.*;
import Login.*;
public class Receive{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	String mobileNumber;
	int amount;
	Login l=new Login();
	private String bl = "";
      private int b = 0;
      private String ph = "";
	private String bn = "";
	private String ps = "";
	private static boolean security;
	public Receive(String mobileNumber, int amount){
		this.mobileNumber=mobileNumber;
		this.amount=amount;
		
		
			
				security = false;
			if( !mobileNumber.equals(l.phone) ){System.out.println(centerAlign+"Wrong phone number!\n"+centerAlign+"Try again with valid phone number");}
			else{security=true;}
	}
	public void completeReceive(){
		if(security==true){
		
		l.balance+=amount;
   		System.out.println(centerAlign+"Receive Successful\n");
   		System.out.println(centerAlign+"Balance = "+l.balance+"\n");
   		try{
            File file = new File("user.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
               ph = scanner.next();
               bn = scanner.next();
               ps = scanner.next();
               bl = scanner.next();
               b = Integer.parseInt(bl);
               b= l.balance;
            }
            scanner.close();
            Formatter formatter = new Formatter("user.txt");
            formatter.format("%s %s %s %s",ph,bn,ps,b);
            formatter.close();
            }catch(Exception e){System.out.println(e);}
   		}
		
	}
}