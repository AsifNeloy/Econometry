import Login.*;
import Bkash.*;
import Manual.*;
import Accessories.*;
import Contributers.*;
import Admin.*;
import Billing.*;
import Cloths.*;
import DBBLCard.*;
import FileIo.*;
import Food.*;
import Game.*;
import Medicine.*;
import java.util.*;
import java.io.*;



public class Main{
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception e){System.out.println(e);}
	}
	static{cls();
		System.out.println("\n\t\t\tEnter Fullscreen First.");}
	
	public static void main(String[]args)throws Exception{
		String centerAlignForTitle= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
		String centerAlineForInput= new String("\t\t\t\t\t\t\t\t\t ");
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		MAIN:
		while(true){
			Register reg = new Register();
			Login log = new Login();
			FileIo fl = new FileIo();
			System.out.println("\n\t\t\t$: FIRST PAGE");

			System.out.println("\n"+centerAlignForTitle+"\"ECONOMETRY\"");
			System.out.println(centerAlignForTitle+"     by CodeGrammer\n\n");
			System.out.println(centerAlignForTitle+"-----------");
			System.out.println(centerAlignForTitle+"1. Admin");
			System.out.println(centerAlignForTitle+"2. General");
			System.out.println(centerAlignForTitle+"0. Exit");
			System.out.println(centerAlignForTitle+"-----------\n");
			System.out.print(centerAlineForInput+"Enter Choice = ");
			//int mainInput = 0;
			

			char mainInput = sc.next().charAt(0);
			cls();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			if(mainInput<'0' && mainInput>'2' && mainInput>='a' && mainInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
			continue MAIN;}
			//else{continue;}
			
			//CleanScreen();
				//flush();
			
			switch(mainInput){

				case '0':
				break MAIN;
				case '1' :
				System.out.println("\n\t\t\t$: ADMIN LOGIN");
				
				System.out.println("");
				//System.out.println(centerAlignForTitle+"\n--------------");
				System.out.print(centerAlineForInput+"Enter User Name = ");
				String uName = sc.next();
				//if(uName.equals("admin")){
				System.out.print(centerAlineForInput+"Enter User Password = ");
				//System.out.println(centerAlignForTitle+"--------------\n");
				String uPass = sc.next();
				cls();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
				Admin admin = new Admin(uName,uPass);//}
				if(admin.security==false){break;}
				else{
				//else{System.out.println("Wrong User Name input");}
					
				ADMIN:
				while(true){
					System.out.println("\n\t\t\t$: ADMIN");
					System.out.println("\n"+centerAlignForTitle+"--------------");
					System.out.println(""+centerAlignForTitle+"1. Show Current User");
					System.out.println(centerAlignForTitle+"2. Chnage Balance");
					System.out.println(centerAlignForTitle+"3. Change Password");
					System.out.println(centerAlignForTitle+"0. Exit");
					System.out.println(centerAlignForTitle+"--------------\n");
					System.out.print(centerAlineForInput+"Enter Choice = ");
					//int adminInput=0;
					
					char adminInput = sc.next().charAt(0);
					cls();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
					if(adminInput<'0' && adminInput>'3' && adminInput>='a' && adminInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
					continue ADMIN;}
					
					//break ADMIN;
					//continue MAIN;
					
					
					//System.out.flush();
					switch(adminInput){
						case '1':
						System.out.println("\n\t\t\t$: ADMIN - Show User");
						admin.showUser(log);
						//fl.readFromFile();
						break;
						case '2':
						System.out.println("\n\t\t\t$: ADMIN - Change Balance");
						System.out.println("\n"+centerAlignForTitle+"--------------");
						System.out.println(centerAlignForTitle+"1. Add balance");
						System.out.println(centerAlignForTitle+"2. Reduce balance");
						System.out.println(centerAlignForTitle+"--------------\n");
						System.out.print(centerAlineForInput+"Enter Choice = ");
						char adBalanceChoice = sc.next().charAt(0);
						if(adBalanceChoice<'1' && adBalanceChoice>'2' && adBalanceChoice>='a' && adBalanceChoice<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
						continue ADMIN;}
						System.out.print(centerAlineForInput+"Enter amount to change = ");
						int chBaln = sc.nextInt();
						cls();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						admin.changeBalance(log,chBaln,adBalanceChoice);
						
						break;
						case '3':
						System.out.println("\n\t\t\t$: ADMIN - Change Password");
						//System.out.println(centerAlignForTitle+"\n--------------");
						System.out.print("\n"+centerAlineForInput+"Enter New Password = ");
						//System.out.println(centerAlignForTitle+"--------------\n");
						String nwpass = sc.next();
						cls();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						admin.changePassword(log,nwpass);
						
						break;
						case '0':
						cls();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						break ADMIN;
						}
						}
					}
				break;

				case '2':
				LOGIN:
				while(true){
					//cls();
					System.out.println("\n\t\t\t$: USER");
					System.out.println("\n"+centerAlignForTitle+"--------------");
					System.out.println(""+centerAlignForTitle+"1. Login");
					System.out.println(centerAlignForTitle+"2. Register");
					System.out.println(centerAlignForTitle+"0. Exit");
					System.out.println(centerAlignForTitle+"--------------\n");
					System.out.println("\t\t\t\t\t\t\t\t\t\tA user must register first to login\n");
					System.out.print(centerAlineForInput+"Enter Choice = ");
					char logInput = sc.next().charAt(0);
					if(logInput<'0' && logInput>'2' && logInput>='a' && logInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
					continue LOGIN;}
					cls();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
					switch(logInput){
						case '1':
						System.out.println("\n\t\t\t$: USER LOGIN");
						System.out.print("\n"+centerAlineForInput+"User Phone Number = ");
						String upn = sc.next();
						System.out.print(centerAlineForInput+"User Bank Account Number = ");
						String uban = sc.next();
						System.out.print(centerAlineForInput+"User Password = ");
						String up = sc.next();
						System.out.println("");
						log.setPhone(upn);
						log.setBankAcc(uban);
						log.setPass(up);
						log.checkDetails();
						
						
						if(log.getSecurity()==true){
							cls();
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
							log.checkDetails();
							ECONOMETRY:
							while(true){
								//cls();
								System.out.println("\n\t\t\t$: HOME");
								System.out.println("\n"+centerAlignForTitle+"\"ECONOMETRY\"");
								System.out.println(centerAlignForTitle+"     by CodeGrammer\n\n");
								System.out.println("\n"+centerAlignForTitle+"--------------");
								System.out.println(""+centerAlignForTitle+"1. Credit Transfer");
								System.out.println("\n"+centerAlignForTitle+"2. Online Shopping");
								System.out.println("\n"+centerAlignForTitle+"3. Bill Payment");
								System.out.println("\n"+centerAlignForTitle+"4. Manual");
								System.out.println("\n"+centerAlignForTitle+"5. Contributers\n");
								System.out.println(centerAlignForTitle+"connection lost?");
								System.out.println(centerAlignForTitle+"6. Offline game");
								System.out.println("\n"+centerAlignForTitle+"0. Exit");
								System.out.println(centerAlignForTitle+"--------------");
								System.out.print("\n"+centerAlineForInput+"Enter Choice = ");
								//int econoInput=0;
								char econoInput = sc.next().charAt(0);
								if(econoInput<'0' && econoInput>'6' && econoInput>='a' && econoInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
								continue ECONOMETRY;}
								
								cls();
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
								switch(econoInput){
									case '0':
									cls();
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
									break ECONOMETRY;

									case '1':
									CREDITTRANSFER:
									while(true){
										System.out.println("\n\t\t\t$: HOME - Credit Transfer");
										System.out.println("\n"+centerAlignForTitle+"--------------");
										System.out.println("   "+centerAlignForTitle+"Credit Transfer\n");
										System.out.println("\n"+centerAlignForTitle+"1. Bkash");
										System.out.println("\n"+centerAlignForTitle+"2. DBBLCard");
										System.out.println("\n"+centerAlignForTitle+"0. Back");
										System.out.println(centerAlignForTitle+"--------------");
										System.out.print("\n"+centerAlineForInput+"Enter Choice = ");
										char creTraInput = sc.next().charAt(0);
										if(creTraInput<'0' && creTraInput>'2' && creTraInput>='a' && creTraInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
										continue CREDITTRANSFER;}
										cls();
										System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
										switch(creTraInput){
											case '0':
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											break CREDITTRANSFER;

											case '1':
											BKASH:
											while(true){
												System.out.println("\n\t\t\t$: HOME - Credit Transfer - BKash");
												System.out.println("\n"+centerAlignForTitle+"--------------");
												System.out.println("   "+centerAlignForTitle+"1. Transfer");
												System.out.println("\n"+centerAlignForTitle+"2. Receive");
												System.out.println("\n"+centerAlignForTitle+"3. Mobile Recharge");
												System.out.println("\n"+centerAlignForTitle+"0. Back");
												System.out.println(centerAlignForTitle+"--------------");
												System.out.print("\n"+centerAlineForInput+"Enter Choice = ");
												char bkashInput = sc.next().charAt(0);
												if(bkashInput<'0' && bkashInput>'3' && bkashInput>='a' && bkashInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
												continue BKASH;}
												cls();
												System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
												switch(bkashInput){
													case '0':
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													break BKASH;
													case '1':
													System.out.println("\n\t\t\t$: HOME - Credit Transfer - BKash - Transfer");
													System.out.println("\n"+centerAlignForTitle+"--------------");
													System.out.println("   "+centerAlignForTitle+"Transfer");
													System.out.println(centerAlignForTitle+"--------------");
													System.out.print("\n"+centerAlineForInput+"Enter your phone number = ");
													String bkpn = sc.next();
													System.out.print("\n"+centerAlineForInput+"Enter amount = ");
													int bka = sc.nextInt();
													System.out.print("\n"+centerAlineForInput+"Enter receiver number = ");
													String bkrpn = sc.next();
													System.out.print("\n"+centerAlineForInput+"Enter pin = ");
													String bkp = sc.next();
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													Transfer tran = new Transfer(bkpn,bka,bkrpn,bkp);
													tran.completeTransfer();
													
													break;
													case '2':
													System.out.println("\n\t\t\t$: HOME - Credit Transfer - BKash - Receive");
													System.out.println("\n"+centerAlignForTitle+"--------------");
													System.out.println("   "+centerAlignForTitle+"Receive");
													System.out.println(centerAlignForTitle+"--------------");
													System.out.print("\n"+centerAlineForInput+"Enter your phone number = ");
													String bkrecpn = sc.next();
													System.out.print("\n"+centerAlineForInput+"Enter amount = ");
													int bkreca = sc.nextInt();
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													Receive rec = new Receive(bkrecpn,bkreca);
													rec.completeReceive();
													System.out.println("\t"+centerAlignForTitle+"\"You have to login again for receive.");
													
													break LOGIN;
													case '3':
													System.out.println("\n\t\t\t$: HOME - Credit Transfer - BKash - Mobile Recahrge");
													System.out.println("\n"+centerAlignForTitle+"-----------------");
													System.out.println("   "+centerAlignForTitle+"Mobile Recharge");
													System.out.println(centerAlignForTitle+"-----------------");
													System.out.print("\n"+centerAlineForInput+"Enter receiver number = ");
													String bkmbrpn = sc.next();
													System.out.print("\n"+centerAlineForInput+"Enter amount = ");
													int bkmba = sc.nextInt();													
													System.out.print("\n"+centerAlineForInput+"Enter pin = ");
													String bkmbp = sc.next();
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													MobileRecharge mr = new MobileRecharge(bkmbrpn,bkmba,bkmbp);
													mr.completeMobileRecharge();
													
													break;
												}
											}
											break;//credit transfer case 1

											case '2':
											DBBLCARD:
											while(true){
												//cls();
												System.out.println("\n\t\t\t$: HOME - Credit Transfer - DBBLCard");
												System.out.println("\n"+centerAlignForTitle+"--------------");
												System.out.println(""+centerAlignForTitle+"1. Transfer");
												System.out.println("\n"+centerAlignForTitle+"2. Receive");
												System.out.println("\n"+centerAlignForTitle+"0. Back");
												System.out.println(centerAlignForTitle+"--------------");
												System.out.print("\n"+centerAlignForTitle+"Enter Choice = ");
												char dbblInput = sc.next().charAt(0);
												if(dbblInput<'0' && dbblInput>'2' && dbblInput>='a' && dbblInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
												continue DBBLCARD;}
												cls();
												System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
												switch(dbblInput){
													case '0':
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													break DBBLCARD;

													case '1':
													System.out.println("\n\t\t\t$: HOME - Credit Transfer - DBBLCard - Transfer");
													System.out.println("\n"+centerAlignForTitle+"----------------------");
													System.out.println("   "+centerAlignForTitle+"Transfer from DBBLCard");
													System.out.println(centerAlignForTitle+"----------------------");
													System.out.print("\n"+centerAlineForInput+"Enter account number = ");
													String dbblphone = sc.next();
													System.out.print("\n"+centerAlineForInput+"Enter amount = ");
													int dbbltranamount = sc.nextInt();													
													System.out.print("\n"+centerAlineForInput+"Enter pin = ");
													String dbbltranPin = sc.next();
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													TransferDBBL tranDB = new TransferDBBL(dbblphone,dbbltranamount,dbbltranPin);
													tranDB.completeTransferDBBL();
													
													break;//dbbl case 1

													case '2':
													System.out.println("\n\t\t\t$: HOME - Credit Transfer - DBBLCard - Receive");
													System.out.println("\n"+centerAlignForTitle+"---------------------");
													System.out.println("   "+centerAlignForTitle+"Receive from DBBLCard");
													System.out.println(centerAlignForTitle+"---------------------");
													System.out.print("\n"+centerAlineForInput+"Enter your account number = ");
													String dbrecac = sc.next();
													System.out.print("\n"+centerAlineForInput+"Enter amount = ");
													int dbrecam = sc.nextInt();
													cls();
													System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
													ReceiveDBBL recDb = new ReceiveDBBL(dbrecac,dbrecam);
													recDb.completeReceiveDBBL();
													System.out.println(centerAlignForTitle+"\"You have to login again for receive.\"");
													
													break LOGIN;//dbbl case 2

												}
											}
											break;//credit transfer case 2
										}
									}
									break;//econometry case 1

									case '2':
									ONLINESHOPPING:
									while(true){
										//cls();
										System.out.println("\n\t\t\t$: HOME - Online Shopping");
										System.out.println("\n"+centerAlignForTitle+"----------------");
										System.out.println("   "+centerAlignForTitle+"Online Shopping");
										System.out.println(centerAlignForTitle+"----------------\n");
										System.out.println("\n"+centerAlignForTitle+"1. Food");
										System.out.println("\n"+centerAlignForTitle+"2. Medicine");
										System.out.println("\n"+centerAlignForTitle+"3. Cloths");
										System.out.println("\n"+centerAlignForTitle+"4. Accessories");
										System.out.println("\n"+centerAlignForTitle+"0. Back");
										System.out.print("\n"+centerAlineForInput+"Enter choice = ");
										char osInput = sc.next().charAt(0);
										if(osInput<'0' && osInput>'4' && osInput>='a' && osInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
										continue ONLINESHOPPING;}
										cls();
										System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
										switch(osInput){
											case '0':
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											break ONLINESHOPPING;

											case '1':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Food");
											Food f = new Food();
											f.showFood();
											System.out.print("\n"+centerAlineForInput+"Enter Rice amount = ");
											int rice = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Fish amount = ");
											int fish = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Chicken amount = ");
											int chicken = sc.nextInt();
											Food fd = new Food(rice, fish, chicken);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											fd.foodCalculation();
											fd.foodList();
											
											break;//online shopping case 1

											case '2':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Medicine");
											Medicine m = new Medicine();
											m.showMedicine();
											System.out.print("\n"+centerAlineForInput+"Enter Ace amount = ");
											int ace = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Alatrol amount = ");
											int alatorl = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Antacid amount = ");
											int antacid = sc.nextInt();
											Medicine md = new Medicine(ace, alatorl, antacid);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											md.medicineCalculation();
											md.medicineList();
											
											break;//online shopping case 2

											case '3':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Cloths");
											Cloths c = new Cloths();
											c.showCloths();
											System.out.print("\n"+centerAlineForInput+"Enter Shirt amount = ");
											int shirt = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Pant amount = ");
											int pant = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter T-shirt amount = ");
											int tshirt = sc.nextInt();
											Cloths clo = new Cloths(shirt, pant, tshirt);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											clo.clothsCalculation();
											clo.clothsList();
											
											break;//online shopping case 3

											case '4':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Accessories");
											Accessories ass = new Accessories();
											ass.showAccessories();
											System.out.print("\n"+centerAlineForInput+"Enter Bag amount = ");
											int bag = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Sun-Glass amount = ");
											int sunglass = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Watch amount = ");
											int watch = sc.nextInt();
											Accessories acces = new Accessories(bag, sunglass, watch);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											acces.accessoriesCalculation();
											acces.accessoriesList();
											//cls();
											break;//online shopping case 4
										}
									}
									break;//econometry case 2

									case '3':
									BILLPAYMENT:
									while(true){
										//cls();
										System.out.println("\n\t\t\t$: HOME - Bill Payment");
										System.out.println("\n   "+centerAlignForTitle+"Bill Payment");
										System.out.println("\n"+centerAlignForTitle+"-----------------------");
										System.out.println(""+centerAlignForTitle+"1. Electric Card recharge");
										System.out.println("\n"+centerAlignForTitle+"2. Water Bill Payment");
										System.out.println("\n"+centerAlignForTitle+"3. Gas Bill Payment");
										System.out.println("\n"+centerAlignForTitle+"0. Back");
										System.out.println(centerAlignForTitle+"-----------------------");
										System.out.print("\n"+centerAlineForInput+"Enter Choice = ");
										
										char billpayInput = sc.next().charAt(0);
										if(billpayInput<'0' && billpayInput>'3' && billpayInput>='a' && billpayInput<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
										continue BILLPAYMENT;}
										cls();
										System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
										switch(billpayInput){
											case '0':
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											break BILLPAYMENT;

											case '1':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Electric Card Recharge");
											System.out.println("\n"+centerAlignForTitle+"----------------------");
											System.out.println("   "+centerAlignForTitle+"Electric Card Recharge");
											System.out.println(centerAlignForTitle+"----------------------");
											System.out.print("\n"+centerAlineForInput+"Enter Card Number = ");
											String cardn = sc.next();
											System.out.print("\n"+centerAlineForInput+"Enter Amount = ");
											int carda = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Pin = ");
											String cardp = sc.next();
											ElectriccardRecharge ecr = new ElectriccardRecharge(cardn, carda, cardp);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											ecr.completeElectriccardRecharge();
											
											break;//bill payment case 1

											case '2':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Water Bill Payment");
											System.out.println("\n"+centerAlignForTitle+"---------------------");
											System.out.println("   "+centerAlignForTitle+"Water Bill Payment");
											System.out.println(centerAlignForTitle+"---------------------");
											System.out.print("\n"+centerAlineForInput+"Enter ID Number = ");
											String waterid = sc.next();
											System.out.print("\n"+centerAlineForInput+"Enter Amount = ");
											int watera = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Pin = ");
											String waterp = sc.next();
											WaterbillPayment wbp = new WaterbillPayment(waterid, watera, waterp);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											wbp.completeWaterbillPayment();
											
											break;//bill payment case 2

											case '3':
											System.out.println("\n\t\t\t$: HOME - Online Shopping - Gas Bill Payment");
											System.out.println("\n"+centerAlignForTitle+"-------------------");
											System.out.println("   "+centerAlignForTitle+"Gas Bill Payment");
											System.out.println(centerAlignForTitle+"-------------------");
											System.out.print("\n"+centerAlineForInput+"Enter ID Number = ");
											String gasid = sc.next();
											System.out.print("\n"+centerAlineForInput+"Enter Amount = ");
											int gasa = sc.nextInt();
											System.out.print("\n"+centerAlineForInput+"Enter Pin = ");
											String gasp = sc.next();
											GasbillPayment gbp = new GasbillPayment(gasid, gasa, gasp);
											cls();
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
											gbp.completeGasbillPayment();
											
											break;//bill payment case 3
										}
									}
									break;//econometry case 3

									case '4':
									cls();
									System.out.println("\n\t\t\t$: HOME - Manual");
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
									Manual manual = new Manual();
									break;//econometry case 4

									case '5':
									cls();
									System.out.println("\n\t\t\t$: HOME - Contributers");
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
									Contributers contributers = new Contributers();
									break;//econometry case 5

									case '6':
									cls();
									System.out.println("\n\t\t\t$: HOME - Game");
									//System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
									Game gm = new Game();
									break;//econometry case 6
								}
							}
							cls();
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
							break;//login case 1 break
						}
						if(log.getSecurity()==false){break LOGIN;}
						break;

						case '2':
						System.out.println("\n\t\t\t$: USER REGISTRATION");
						System.out.print(centerAlineForInput+"Enter Your Phone Number = ");
						String ypn = sc.next();
						System.out.print(centerAlineForInput+"Enter Your Bank Account Number = ");
						String yban = sc.next();
						System.out.print(centerAlineForInput+"Enter A Memorable Password = ");
						String yps = sc.next();
						cls();
						reg.setPhoneNumber(ypn);
						reg.setBankAccountNumber(yban);
						reg.setPassword(yps);
						reg.createFile();
						fl.writeInFile("Phone Number : "+reg.getPhoneNumber());
						fl.writeInFile("Account Number : "+reg.getBankAccountNumber());
						fl.writeInFile("User Password : "+reg.getPassword());
						//fl.writeInFile("User Balance : "+String.valueOf(reg.getBalance()));
						//reg.createHistory("Number : "+ypn+" Account : "+yban+" Password : "+yps+"\n");
						
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("\n"+centerAlignForTitle+"\"Input Successful.\n"+centerAlignForTitle+"Login with your details now.\"");
						break;

						case '0':
						cls();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						break LOGIN;
					}

				}
				break;
			}
		}
	}
}