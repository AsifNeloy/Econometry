package Game;
import java.util.Random;

import java.util.Scanner;

public class Game{
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t  ");
	String centerAlignInput= new String("\t\t\t\t\t\t\t\t\t ");
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception e){System.out.println(e);}
	}
	public Game(){
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String enemyName[] = new String[4];
		enemyName[0] = "Charizard";
		enemyName[1] = "Letho";
		enemyName[2] = "Witch";
		enemyName[3] = "Dark Ganon";
		int maxEnemyHealth = 80;
		int maxEnemyAttack = 35;

		int playerHealth = 100;
		int playerAttack = 50;
		int numHealthPoison = 3;
		int poisonHeal = 30;
		int poisonDropChance = 60;

		boolean play = true;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(centerAlign+"   ###################################");
		System.out.println(centerAlign+"\t\"WELCOME TO CODEWAR GROUND\"");
		STARTING:
		while(play){
			System.out.println(centerAlign+"   ###################################\n\n");
			
			int enemyHealth= ran.nextInt(maxEnemyHealth);
			String enemy = enemyName[ran.nextInt(enemyName.length)];
			System.out.println(centerAlign+"\""+enemy+" has appeared!\"\n");
			
			while(enemyHealth>0){
				System.out.println(centerAlign+"Your Health : "+playerHealth);
				System.out.println(centerAlign+""+enemy+"'s HP : "+enemyHealth+"\n");
				System.out.println(centerAlign+"Major, there is an enemy. What do you like to do?");
				System.out.println(centerAlign+"1. Attack");
				System.out.println(centerAlign+"2. Dirnk Health Poison");
				System.out.println(centerAlign+"3. Run");

				System.out.print(centerAlignInput+"Enter choice : ");
				String answer = sc.nextLine();
				cls();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
				if(answer.equals("1")){
					int damageGiven = ran.nextInt(playerAttack);
					int damageTaken = ran.nextInt(maxEnemyAttack);
					playerHealth = playerHealth-damageTaken;
					enemyHealth = enemyHealth-damageGiven;
					cls();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println(centerAlign+"Major, you strike "+enemy+" for "+damageGiven+" damage");
					System.out.println(centerAlign+""+enemy+" has given you "+damageTaken+" damage");
					
					if(playerHealth<=0){
						System.out.println(centerAlign+"Oh no! "+enemy+" has defeated you!");
						break;
					}
				}
				else if(answer.equals("2")){
					
					if(numHealthPoison>0){
						playerHealth = playerHealth+poisonHeal;
						if(playerHealth>100){
							playerHealth=100;
						}
						numHealthPoison--;
						cls();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println(centerAlign+"Healed yourself for "+poisonHeal+" amount");
						System.out.println(centerAlign+"Health after healing : "+playerHealth);
						System.out.println(centerAlign+"Poison Left : "+numHealthPoison);
					}
					else{
						cls();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println(centerAlign+"No health posion remaining major.");
						System.out.println(centerAlign+"Defeat enemy for a chance to find a health posion");
					}
				}
				else if(answer.equals("3")){
					cls();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println(centerAlign+"Major, you ran away!");
					continue STARTING;
				}
				else{
					System.out.println(centerAlign+"Invalid command");
				}
			}

			if(playerHealth<1){
				cls();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println(centerAlign+"\"Oh no! you have been defeated!\"");
				break;
			}
			cls();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n"+centerAlign+"   ###################################");
			System.out.println(centerAlign+"\""+enemy+" was defeated!\"");
			System.out.println(centerAlign+"\"MAJOR WINS!\"");
			System.out.println(centerAlign+"You have "+playerHealth+" HP left");
			if(ran.nextInt(100)<poisonDropChance){
				numHealthPoison++;
				System.out.println(centerAlign+""+enemy+" dropped a healing poison");
				System.out.println(centerAlign+" Poison remaining : "+numHealthPoison);
			}

			System.out.println(centerAlign+"   ###################################\n");
			System.out.println(centerAlign+"Major, what do you like to do now?");
			System.out.println(centerAlign+"1. Continue fighting");
			System.out.println(centerAlign+"2. Exit ground");

			System.out.print(centerAlignInput+"Enter choice : ");
			String input = sc.nextLine();
			cls();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			while(!input.equals("1") && !input.equals("2")){
				System.out.println(centerAlign+"Invalid command");
				input = sc.nextLine();
			}
			if(input.equals("1")){
				System.out.println(centerAlign+"Let's have another fight major!");
			}
			else if(input.equals("2")){
				System.out.println(centerAlign+"You have left the ground. Take some rest major");
				break;
			}
		}
		cls();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(centerAlign+"   ###################################");
		System.out.println(centerAlign+"Thanks for playing\n");
		System.out.println(centerAlign+"CODEWAR GROUND");
		System.out.println(centerAlign+"Created by CodeGrammar");
		System.out.println(centerAlign+"   ###################################");
	}
}