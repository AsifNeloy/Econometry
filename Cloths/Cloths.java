package Cloths;
import java.io.*;
import java.util.*;

import Login.*;
public class Cloths{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	int shirtAmount;
	int pantAmount;
	int tShirtAmount;	
	int delivaryCharge=80;
	Login l = new Login();
	private String bl = "";
    private int b = 0;
    private String ph = "";
	private String bn = "";
	private String ps = "";
	public Cloths(){}
	public Cloths(int shirtAmount,int pantAmount,int tShirtAmount){
		this.shirtAmount=shirtAmount;
		this.pantAmount=pantAmount;
		this.tShirtAmount=tShirtAmount;
	}
	public void showCloths(){
		System.out.println(centerAlign+"Shirt          : "+400+" taka/piece");
		System.out.println(centerAlign+"Pant           : "+550+" taka/piece");
		System.out.println(centerAlign+"T-shirt        : "+300+" taka/piece");
		System.out.println(centerAlign+"Delivary Charge: "+80+" taka");
	}
	public void clothsCalculation(){
		if(shirtAmount==0){l.balance+=0;}
		else{l.balance-=(shirtAmount*400);}
		
		if(pantAmount==0){l.balance+=0;}
		else{l.balance-=(pantAmount*550);}

		if(tShirtAmount==0){l.balance+=0;}
		else{l.balance-=(tShirtAmount*300);}
		l.balance+=delivaryCharge;
	}
	public void clothsList(){
		if(l.balance<0){System.out.println(centerAlign+"Insufficient Balance.\n"+centerAlign+"You do not have enough balance to buy.");}
		else{
			System.out.println(centerAlign+"Shirt           : "+(shirtAmount*400)+" taka");
			System.out.println(centerAlign+"Pant            : "+(pantAmount*550)+" taka");
			System.out.println(centerAlign+"T-shirt         : "+(tShirtAmount*300)+" taka");
			System.out.println(centerAlign+"Delivary Charge : "+delivaryCharge+" taka");
			System.out.println(centerAlign+"______________________________________");
			System.out.println(centerAlign+"Total           : "+(shirtAmount*400+pantAmount*550+tShirtAmount*300+delivaryCharge)+" taka");
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