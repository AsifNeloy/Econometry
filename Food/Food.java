package Food;
import Login.*;

import java.io.*;
import java.util.*;

public class Food{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	int riceAmount;
	int fishAmount;
	int chickenAmount;	
	int delivaryCharge=100;
	Login l = new Login();

	private String bl = "";
    private int b = 0;
    private String ph = "";
	private String bn = "";
	private String ps = "";

	public Food(){}
	public Food(int riceAmount,int fishAmount,int chickenAmount){
		this.riceAmount=riceAmount;
		this.fishAmount=fishAmount;
		this.chickenAmount=chickenAmount;
	}
	public void showFood(){
		System.out.println(centerAlign+"Rice           : "+60+" taka/kg");
		System.out.println(centerAlign+"Hilsha Fish    : "+1000+" taka/piece");
		System.out.println(centerAlign+"Chicken        : "+450+" taka/piece");
		System.out.println(centerAlign+"Delivary Charge: "+50+" taka");
	}
	public void foodCalculation(){
		if(riceAmount==0){l.balance+=0;}
		else{l.balance-=(riceAmount*60);}
		
		if(fishAmount==0){l.balance+=0;}
		else{l.balance-=(fishAmount*1000);}

		if(chickenAmount==0){l.balance+=0;}
		else{l.balance-=(chickenAmount*450);}
		l.balance+=delivaryCharge;
	}
	public void foodList(){
		if(l.balance<0){System.out.println(centerAlign+"Insufficient Balance.\n"+centerAlign+"You do not have enough balance to buy.");}
		else{
			System.out.println(centerAlign+"Rice            : "+(riceAmount*60)+" taka");
			System.out.println(centerAlign+"Fish            : "+(fishAmount*1000)+" taka");
			System.out.println(centerAlign+"Chicken         : "+(chickenAmount*450)+" taka");
			System.out.println(centerAlign+"Delivary Charge : "+delivaryCharge+" taka");
			System.out.println(centerAlign+"______________________________________");
			System.out.println(centerAlign+"Total           : "+(riceAmount*60+fishAmount*1000+chickenAmount*450+delivaryCharge)+" taka");
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