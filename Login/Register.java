package Login;
import java.io.*;
import java.util.*;

public class Register{
	static Login log;
	//Register reg;
	public static String phoneNumber = "";
	public static String bankAccountNumber = "";
	//public static String userName;
	public static String password = "";
	public static int userCount = 1;
	public static int balance = log.balance;

	 
    //public File file ;
    
    //private FileReader reader;
   // private BufferedReader bfr;
     //private FileWriter writer ;

	public Register(){
		//System.out.println("\t\tREGISTRATION\n");
		//userCount++;
	}
	public Register(String phoneNumber,String bankAccountNumber,String password){
		this.phoneNumber=phoneNumber;
		this.bankAccountNumber=bankAccountNumber;
		this.password=password;
		
		userCount++;
	}
	public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;
		userCount++;}
	public String getPhoneNumber(){return phoneNumber;}
	public void setBankAccountNumber(String bankAccountNumber){this.bankAccountNumber=bankAccountNumber;}
	public String getBankAccountNumber(){return bankAccountNumber;}
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return password;}
	public int getBalance(){return balance;}
	/*public static void main(String[]args){
		Register r = new Register("01776670525","42961","Igg");
		System.out.println(r.getphoneNumber()+" "+r.getBankAccountNumber()+" "+r.getPassword());
	}*/
	public void createFile(){
		try{
			Formatter formatter = new Formatter("user.txt");
			formatter.format("%s %s %s %s",phoneNumber,bankAccountNumber,password,balance);
			formatter.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
	}

	/*public void createHistory(String s)throws Exception{
		 try
        {
        	 
            
            file = new File("History.txt"); 
             writer = new FileWriter(file);
            
            file.createNewFile();
            
            writer = new FileWriter(file, true); 
                            
            writer.write(s+"\r\n"); 
            writer.flush();
            writer.close();        
        
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace() ;
        }
	}*/

}