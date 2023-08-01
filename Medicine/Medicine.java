package Medicine;
import Login.*;
import java.io.*;
import java.util.*;
public class Medicine{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");

	int aceAmount;
	int alatrolAmount;
	int antacidAmount;	
	int delivaryCharge=50;
	Login l = new Login();
	private String bl = "";
    private int b = 0;
    private String ph = "";
	private String bn = "";
	private String ps = "";
	public Medicine(){}
	public Medicine(int aceAmount,int alatrolAmount,int antacidAmount){
		this.aceAmount=aceAmount;
		this.alatrolAmount=alatrolAmount;
		this.antacidAmount=antacidAmount;
	}
	public void showMedicine(){
		System.out.println(centerAlign+"Ace            : "+12+" taka/package");
		System.out.println(centerAlign+"Alatrol        : "+35+" taka/package");
		System.out.println(centerAlign+"Antacid        : "+15+" taka/package");
		System.out.println(centerAlign+"Delivary Charge: "+50+" taka");
	}
	public void medicineCalculation(){
		if(aceAmount==0){l.balance+=0;}
		else{l.balance-=(aceAmount*12);}
		
		if(alatrolAmount==0){l.balance+=0;}
		else{l.balance-=(alatrolAmount*35);}

		if(antacidAmount==0){l.balance+=0;}
		else{l.balance-=(antacidAmount*15);}
		l.balance+=delivaryCharge;
	}
	public void medicineList(){
		if(l.balance<0){System.out.println(centerAlign+"Insufficient Balance.\n"+centerAlign+"You do not have enough balance to buy.");}
		else{
			System.out.println(centerAlign+"Ace             : "+(aceAmount*12)+" taka");
			System.out.println(centerAlign+"Alatrol         : "+(alatrolAmount*35)+" taka");
			System.out.println(centerAlign+"Antacid         : "+(antacidAmount*15)+" taka");
			System.out.println(centerAlign+"Delivary Charge : "+delivaryCharge+" taka");
			System.out.println(centerAlign+"______________________________________");
			System.out.println(centerAlign+"Total           : "+(aceAmount*12+alatrolAmount*35+antacidAmount*15+delivaryCharge)+" taka");
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