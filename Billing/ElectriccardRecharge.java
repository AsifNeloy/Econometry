 package Billing;
import Login.*;
import java.io.*;
import java.util.*;
public class ElectriccardRecharge {
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t");
	public String cardNumber;
	public int amount;
	public String pinNumber;
	private static boolean security;
	Login l=new Login();
	private String bl = "";
    private int b = 0;
    private String ph = "";
    private String bn = "";
    private String ps = "";
	public ElectriccardRecharge(){}
	public ElectriccardRecharge(String cardNumber,int amount, String pinNumber){
		this.cardNumber=cardNumber;
		this.amount=amount;
		this.pinNumber=pinNumber;
		//Register reg = new Register();
    security = false;
		if( pinNumber.equals(l.pass ) ) {security=true;}
		else{System.out.println(centerAlign+"Wrong pin/password!\n"+centerAlign+"Try again with valid pin/password");}
	}
	public void completeElectriccardRecharge(){
		if(security==true){
		//Login l=new Login();
   		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println(centerAlign+"Transfer Successful\n");
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
   		else{System.out.println(centerAlign+"Insufficiat balance\n");}
   		}
	}
}
