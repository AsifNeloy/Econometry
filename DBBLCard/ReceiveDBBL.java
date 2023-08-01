package DBBLCard;
import Login.*;
import java.io.*;
import java.util.*;
public class ReceiveDBBL{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	String accNumber;
	int amount;
	private static boolean security;
	Login l=new Login();
	private String bl = "";
    private int b = 0;
    private String ph = "";
    private String bn = "";
    private String ps = "";
	public ReceiveDBBL(String accNumber, int amount){
		this.accNumber=accNumber;
		this.amount=amount;
		//Register reg = new Register();
		
			security = false;
			
			if( !accNumber.equals(l.bankAcc) ){System.out.println(centerAlign+"Wrong bank account number!\n"+centerAlign+"Try again with valid bank account number");}
      else{security=true;}
	}
	public void completeReceiveDBBL(){
		if(security==true){
		//Login l= new Login();
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