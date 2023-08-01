package Admin;
import java.io.*;
import java.util.*;
import Login.*;
public class Admin{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	Register reg = new Register();
	Login log= new Login();
	private  String userName = "admin";
	private  String password = "admin";
	public static boolean security;
	private String bl="";
	private String ph="";
	private String bn="";
	private String p="";
	private String ps="";
	private int nb =0;
	//private File f = reg.file;
	//private FileReader reader ;

    /*private BufferedReader bfr ;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader bfr    = new BufferedReader(isr);*/

	

	public Admin(){}
	public Admin(String userName, String password){
		security = false;
		if((!this.userName.equals(userName)) && (!this.password.equals(password)))
		{
			security=false;
			System.out.println(centerAlign+"WRONG PASSWORD!");
		}
		//else{security=true;}
		if((this.userName.equals(userName)) && (this.password.equals(password)))
		{
			security=true;
			//System.out.println(centerAlign+"WRONG PASSWORD!");
		}
	}
	
	public void showUser(Login log)throws Exception{
		if(security==true){
			if(reg.userCount==0){System.out.println(centerAlign+"No user found.\n"+centerAlign+" A user have to register first for this option.");}
			else{
				try{
				File file = new File("user.txt");
				Scanner scanner = new Scanner(file);

				while(scanner.hasNext()){
				 	log.phone = scanner.next();
				 	log.bankAcc = scanner.next();
				 	log.pass = scanner.next();
				 	bl = scanner.next();
					log.balance = Integer.parseInt(bl);
					}
					scanner.close();
					}catch(Exception e){System.out.println(e);}
				System.out.println(centerAlign+"User phone number        = "+log.phone);
				System.out.println(centerAlign+"User bank account number = "+log.bankAcc);
				System.out.println(centerAlign+"User password            = "+log.pass);
				System.out.println(centerAlign+"User balance             = "+log.balance);

				System.out.println(centerAlign+"History : ");

				/* try
		        {
		             
		            reader = new FileReader(f);
		            bfr = new BufferedReader(reader);//loop theke bahire ansi
		            if(f.exists())
		            {
		                //bfr = new BufferedReader(reader);        
		                String text =" ", temp=" ";//temp e faka string nisi                    
		            
		                while((temp=bfr.readLine()) != null)        
		                {
		                    text = text + temp+"\n"+"\r";            
		                }
		            
		                System.out.println(centerAlign +text);                
		                reader.close();
		            }
		            else
		            {
		                System.out.println(centerAlign+"No entry yet!!");
		            }                
		        }
		        catch(IOException ioe)
		        {
		            ioe.printStackTrace();
		        }*/
			}
		}
	}
	
	public void changeBalance(Login log,int amount,char posOrneg){
		if(security==true){
			if(reg.userCount==0){System.out.println(centerAlign+"No user found.\n"+centerAlign+" A user have to register first for this option.");}
			else if(posOrneg=='1'){
				try{
		            File file = new File("user.txt");
		            Scanner scanner = new Scanner(file);

		            while(scanner.hasNext()){
		               ph = scanner.next();
		               bn = scanner.next();
		               p = scanner.next();
		               bl = scanner.next();
		               log.balance = Integer.parseInt(bl);		               
		            }
		            scanner.close();
		            
		            }catch(Exception e){System.out.println(e);}
				System.out.println(centerAlign+"Successfully changed");
				log.balance+=amount;
				nb=log.balance;
				System.out.println(centerAlign+"User balance after change = "+log.balance);
				try{
					Formatter formatter = new Formatter("user.txt");
            		formatter.format("%s %s %s %s",ph,bn,p,nb);
            		formatter.close();
				}catch(Exception e){System.out.println(e);}
			}
			else if(posOrneg=='2'){
				System.out.println(centerAlign+"Successfully changed");
				try{
		            File file = new File("user.txt");
		            Scanner scanner = new Scanner(file);

		            while(scanner.hasNext()){
		               ph = scanner.next();
		               bn = scanner.next();
		               p = scanner.next();
		               bl = scanner.next();
		               log.balance = Integer.parseInt(bl);		               
		            }
		            scanner.close();
		            
		            }catch(Exception e){System.out.println(e);}
				log.balance-=amount;
				nb=log.balance;
				System.out.println(centerAlign+"User balance after change = "+log.balance);
				try{
					Formatter formatter = new Formatter("user.txt");
            		formatter.format("%s %s %s %s",ph,bn,p,nb);
            		formatter.close();
				}catch(Exception e){System.out.println(e);}
			}
			else{System.out.println(centerAlign+"Worng Input!");}
		}
		else{System.out.println(centerAlign+"Only valid admin can change balance of an user.");}
	}

	public void changePassword(Login log, String changedPass){
		if(security==true){

			try{
		            File file = new File("user.txt");
		            Scanner scanner = new Scanner(file);

		            while(scanner.hasNext()){
		               ph = scanner.next();
		               bn = scanner.next();
		               log.pass = scanner.next();
		               bl = scanner.next();
		               //log.pass = ps;		               
		            }
		            scanner.close();
		            
		            }catch(Exception e){System.out.println(e);}
			log.pass = changedPass;
			ps=log.pass;
			System.out.println(centerAlign+"Successfully changed");
			System.out.println(centerAlign+"User password after change = "+log.pass);
			try{
					Formatter formatter = new Formatter("user.txt");
            		formatter.format("%s %s %s %s",ph,bn,ps,bl);
            		formatter.close();
				}catch(Exception e){System.out.println(e);}

		}
		else{System.out.println(centerAlign+"Only valid admin can change balance of an user.");}
	}
}
	
