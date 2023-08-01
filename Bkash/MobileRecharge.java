package Bkash;

import java.io.*;
import java.util.*;

import Login.*;
public class MobileRecharge{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	String receiverNumber;
	int amount;
	String pinNumber;
	
	private String bl = "";
    private int b = 0;
	private String ph = "";
	private String bn = "";
	private String ps = "";

	Login l=new Login();
	private static boolean security;
	public MobileRecharge(){}
	public MobileRecharge(String receiverNumber,int amount, String pinNumber){
		this.receiverNumber=receiverNumber;
		this.amount=amount;
		this.pinNumber=pinNumber;
		//Register reg = new Register();
      security = false;
		 
		if( !pinNumber.equals(l.pass ) ){System.out.println(centerAlign+"Wrong pin/password!\n"+centerAlign+"Try again with valid pin/password");}
      else{security=true;}
   	}
	public void completeMobileRecharge(){
		if(security==true){
		
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