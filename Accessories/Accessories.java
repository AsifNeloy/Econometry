package Accessories;
import java.io.*;
import java.util.*;
import Login.*;
public class Accessories{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	int bagAmount;
	int sunglassAmount;
	int watchAmount;	
	int delivaryCharge=150;
	private String bl = "";
    private int b = 0;
    private String ph = "";
	private String bn = "";
	private String ps = "";
	Login l = new Login();
	public Accessories(){}
	public Accessories(int bagAmount,int sunglassAmount,int watchAmount){
		this.bagAmount=bagAmount;
		this.sunglassAmount=sunglassAmount;
		this.watchAmount=watchAmount;
	}
	public void showAccessories(){
		System.out.println(centerAlign+"Bag            : "+450+" taka/piece");
		System.out.println(centerAlign+"Sun glass      : "+350+" taka/piece");
		System.out.println(centerAlign+"Watch          : "+500+" taka/piece");
		System.out.println(centerAlign+"Delivary Charge: "+150+" taka");
	}
	public void accessoriesCalculation(){
		if(bagAmount==0){l.balance+=0;}
		else{l.balance-=(bagAmount*450);}
		
		if(sunglassAmount==0){l.balance+=0;}
		else{l.balance-=(sunglassAmount*350);}

		if(watchAmount==0){l.balance+=0;}
		else{l.balance-=(watchAmount*500);}
		l.balance+=delivaryCharge;
	}
	public void accessoriesList(){
		if(l.balance<0){System.out.println(centerAlign+"Insufficient Balance.\n"+centerAlign+"You do not have enough balance to buy.");}
		else{
			System.out.println(centerAlign+"Bag             : "+(bagAmount*450)+" taka");
			System.out.println(centerAlign+"Sun Glass       : "+(sunglassAmount*350)+" taka");
			System.out.println(centerAlign+"Watch           : "+(watchAmount*500)+" taka");
			System.out.println(centerAlign+"Delivary Charge : "+delivaryCharge+" taka");
			System.out.println(centerAlign+"______________________________________");
			System.out.println(centerAlign+"Total           : "+(bagAmount*450+sunglassAmount*350+watchAmount*500+delivaryCharge)+" taka");
			System.out.println("\n"+centerAlign+"Balance         : "+l.balance+" taka");

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