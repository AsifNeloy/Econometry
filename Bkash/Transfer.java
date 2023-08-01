package Bkash;
import java.io.*;
import java.util.*;
import Login.*;
public class Transfer{
   String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	String phoneNumber;
   	int amount;
   	String receiverNumber;
   	String pinNumber;
      Login l=new Login();
      private String bl = "";
      private int b = 0;
      private String ph = "";
      private String bn = "";
      private String ps = "";
      private static boolean security;
   	public Transfer(String phoneNumber, int amount, String receiverNumber, String pinNumber){
   		this.phoneNumber=phoneNumber;
   		this.amount=amount;
   		this.receiverNumber=receiverNumber;
   		this.pinNumber=pinNumber;
         //Register reg = new Register();
          security = false;
         if( !pinNumber.equals(l.pass ) || !phoneNumber.equals(l.phone) ){System.out.println(centerAlign+"Worng phone number!\n"+centerAlign+" Wrong pin/password!\n"+centerAlign+"Try again with valid pin/password & phone number");}
         else{security=true;}
   	}
   	public void completeTransfer(){
   		
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