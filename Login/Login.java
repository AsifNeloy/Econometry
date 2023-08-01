package Login;
import java.io.File;
import java.util.Scanner;
public class Login {
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	Register reg;
	public static String phone = "";
	public static String bankAcc = "";
	public static String pass = "";
	public static boolean security;
	public static int balance=10000;
	private String ph = "";
	private String bn = "";
	private String ps = "";
	private String bl = "";
	public Login(){}
	public Login(String phone,String bankAcc,String pass){
		this.phone=phone;
		this.bankAcc=bankAcc;
		this.pass=pass;
	}
	public void setPhone(String phone){this.phone=phone;}
	public void setBankAcc(String bankAcc){this.bankAcc=bankAcc;}
	public void setPass(String pass){this.pass=pass;}
	public boolean getSecurity(){return security;}
	public int getBalance(){return balance;}
	public void checkDetails(){
		//String p = reg.getPhoneNumber();
		//String b = reg.getBankAccountNumber();
		//String pa = reg.getPassword();
		
		try{
			File file = new File("user.txt");
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext()){
				 ph = scanner.next();
				 bn = scanner.next();
				 ps = scanner.next();
				 bl = scanner.next();
				balance = Integer.parseInt(bl);
			}
			scanner.close();
		}catch(Exception e){System.out.println(e);}
		security=false;
		if(!phone.equals(ph) || !bankAcc.equals(bn) || !pass.equals(ps) ){System.out.println(centerAlign+"Wrong input. Try again!\n");}
		else{
			System.out.println(centerAlign+"Login Successful\n");
					security=true;
		}
		/*if( phone.equals(ph)){
			if( bankAcc.equals(bn)){
				if( pass.equals(ps)){
					System.out.println(centerAlign+"Login Successful\n");
					security=true;
				}
				else{System.out.println(centerAlign+"Wrong password input\n");}
			}
			else{System.out.println(centerAlign+"Wrong Bank Account Number input\n");}
		}
		else{System.out.println(centerAlign+"Wrong Number input\n");}*/
	}
	/*public static void main(String[]args){
		Register r=new Register();
		r = new Register("01776670525","42961","Ihateyou");
		Login l=new Login("01776670525","42961","Iloveyou");
		l.checkDetails();
	}
}
class Register{
	static String phoneNumber;
	static String bankAccountNumber;
	static String password;
	public Register(){
		System.out.println("\t\tREGISTRATION\n");
	}
	public Register(String phoneNumber,String bankAccountNumber,String password){
		this.phoneNumber=phoneNumber;
		this.bankAccountNumber=bankAccountNumber;
		this.password=password;
	}
	public String getPhoneNumber(){return phoneNumber;}
	public String getBankAccountNumber(){return bankAccountNumber;}
	public String getPassword(){return password;}
	public static void main(String[]args){
		Register r = new Register("01776670525","42961","Iloveyou");
		System.out.println(r.getphoneNumber()+" "+r.getBankAccountNumber()+" "+r.getPassword());
	}*/
	/*if( phone.equals(reg.phoneNumber)){
			if( bankAcc.equals(reg.bankAccountNumber )){
				if( pass.equals(reg.password )){
					System.out.println(centerAlign+"Login Successful\n");
					security=true;
				}
				else{System.out.println(centerAlign+"Wrong password input\n");}
			}
			else{System.out.println(centerAlign+"Wrong Bank Account Number input\n");}
		}
		else{System.out.println(centerAlign+"Wrong Number input\n");}*/
}