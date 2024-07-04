import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Hangman{
	Scanner sc=new Scanner(System.in);
	int ran;
	String choice;
	int choiceInt;
	String word;
	int wordCount;
	String letter;
	int count=1;
	int wrongCount;
	boolean wrongcheck;
	int correctLeters;
	char[] gettingletters=new char[13];
	int lettertime;
	boolean checknumber=true;
	public static void main(String[] args) {
		Hangman hm=new Hangman();
		/*hm.wrongone();
		hm.wrongtwo();
		hm.wrongthree();
		hm.wrongfour();
		hm.wrongfive();
		hm.wrongsix();
		hm.correct();*/
		hm.menu();
	}
	public void play(){
		String[] words={"lucky","matrix","oxygen","icebox","zombie","jockey"};
		Random random=new Random();
		ran=random.nextInt(5);
		//System.out.println("Random number is:"+ran+" Word is:"+words[ran]);
		word=words[ran];
		wordCount=word.length();
		//System.out.println("Word Count:"+wordCount);
		System.out.println();
		System.out.println();
		System.out.println("a  b  c  d  e  f  g  h  i  j  k  l  m");
		System.out.println("n  o  p  q  r  s  t  u  v  w  x  y  z");
		System.out.println();
		char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] correctValue=new String[wordCount];
		try{
			for(int j=0;j<correctValue.length;j++){
			correctValue[j]="    ";
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		while(count<7){//while 1
			wrongcheck=false;
			getLetters();
			for(int i=0;i<wordCount;i++){
				if(word.charAt(i)==letter.charAt(0)){
					//boolean letter+(i)=true;
					//System.out.println(letter+" Found");
					count=count-1;
					wrongcheck=true;
					//int k=i;
					correctValue[i]=letter;
					correctLeters=correctLeters+1;
					System.out.println("|+-------Correct letter-------+|");
					
				}else{

					//System.out.println(letter+" Not Found");
					
				}
				
			}
			for(int k=0;k<correctValue.length;k++){
					System.out.print("  "+correctValue[k]);
				}
			System.out.println();
			//String[] alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			for(int i=1;i<=wordCount;i++){
				System.out.print(" __");
			}
			System.out.println();
			System.out.println();
			//System.out.println(letter);
			for(int i=0;i<alphabet.length;i++){
				if(alphabet[i]==letter.charAt(0)){
					alphabet[i]='_';
				}
			}
			for(int i=0;i<13;i++){
				System.out.print("   "+alphabet[i]);
			}
			System.out.println();
			for(int i=13;i<26;i++){
				System.out.print("   "+alphabet[i]);
			}
			System.out.println();
			count=count+1;
			if(wrongcheck==false){
				wrongCount=wrongCount+1;
				switch(wrongCount){
					case 1:wrongone();break;
					case 2:wrongtwo();break;
					case 3:wrongthree();break;
					case 4:wrongfour();break;
					case 5:wrongfive();break;
					case 6:wrongsix();break;
				}
			}
			if(correctLeters==wordCount){
				try{
					System.out.println("|+------Contrajulations------+|");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("|+------You Win the game------+|");
					TimeUnit.SECONDS.sleep(2);
					correct();
					TimeUnit.SECONDS.sleep(2);
					break;
				}catch(Exception e){

				}
				

			}

		}//end of while 1
		/*for(int i=0;i<gettingletters.length;i++){
							System.out.print(" "+gettingletters[i]);
						}*/

		
		
	}
	public void getLetters(){
		try{
			while(true){
				checknumber=true;
				System.out.print("Plese enter a letter(a-z):");
				letter=sc.next();
				for(int i=0;i<gettingletters.length;i++){
					if(gettingletters[i]==letter.charAt(0)){
						checknumber=false;
					}
				}
				if(letter.length()==1 && (letter.matches("^[a-zA-Z]*$"))){
					
					if(checknumber){
						gettingletters[lettertime]=letter.charAt(0);
						lettertime=lettertime+1;
						break;
					}else{
						System.out.println("You use this letter before..");
					}
					
				}else{
					System.out.println("Please enter only one letter(a-z):");
				}
			}
		
		}catch(Exception e){
			System.out.println(e);
		}
		

	}
	public void wrongone(){
		System.out.println("|+----------Wrong Value-----------+|");
		System.out.println("|+--------------------------------+|");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/        ");
		System.out.println("	|	           ");
		System.out.println("	|	        ");
		System.out.println("	|	           ");
		System.out.println("	|	           ");
		System.out.println("	|	  	        ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("____|______________________________  ");
		
	}
	public void wrongtwo(){
		System.out.println("|+----------Wrong Value-----------+|");
		System.out.println("|+--------------------------------+|");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	      |     |      ");
		System.out.println("	|	      | 	|    ");
		System.out.println("	|	      |	    |      ");
		System.out.println("	|	      |	    |      ");
		System.out.println("	|	  	  \\_ _ _/      ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("____|______________________________  ");
		
	}
	public void wrongthree(){
		System.out.println("|+----------Wrong Value-----------+|");
		System.out.println("|+--------------------------------+|");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	    /              ");
		System.out.println("	|	   / /|	    |    ");
		System.out.println("	|	  |	| |	    |      ");
		System.out.println("	|	 | |  |	    |      ");
		System.out.println("	|	 # 	  \\_ _ _/      ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("____|______________________________  ");
		
	}
	public void wrongfour(){
		System.out.println("|+----------Wrong Value-----------+|");
		System.out.println("|+--------------------------------+|");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	    /         \\     ");
		System.out.println("	|	   / /|	    |\\ \\   ");
		System.out.println("	|	  |	| |	    | | |    ");
		System.out.println("	|	 | |  |	    |  | |   ");
		System.out.println("	|	 # 	  \\_ _ _/    #  ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("	|	 	                 ");
		System.out.println("____|______________________________  ");
		
	}
	public void wrongfive(){
		System.out.println("|+----------Wrong Value-----------+|");
		System.out.println("|+--------------------------------+|");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	    /         \\     ");
		System.out.println("	|	   / /|	    |\\ \\   ");
		System.out.println("	|	  |	| |	    | | |    ");
		System.out.println("	|	 | |  |	    |  | |   ");
		System.out.println("	|	 # 	  \\_ _ _/    #  ");
		System.out.println("	|	 	  |  |           ");
		System.out.println("	|	 	  |  |           ");
		System.out.println("	|	 	  |  |           ");
		System.out.println("	|	 	  |  |           ");
		System.out.println("	|	 	 /__]_           ");
		System.out.println("____|______________________________  ");
		
	}
	public void wrongsix(){
		System.out.println("|+----------Wrong Value-----------+|");
		System.out.println("|+--------------------------------+|");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	    /         \\     ");
		System.out.println("	|	   / /|	    |\\ \\   ");
		System.out.println("	|	  |	| |	    | | |    ");
		System.out.println("	|	 | |  |	    |  | |   ");
		System.out.println("	|	 # 	  \\_ _ _/    #  ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	 /__]_[__\\       ");
		System.out.println("____|______________________________  ");
		System.out.println();
		System.out.println("|+-------Correct word is:"+word+"-------+|");
		
	}
	public void correct(){
		System.out.println("	|			 	 	     ");
		System.out.println("	|		                 ");
		System.out.println("	|		                 ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	    /         \\     ");
		System.out.println("	|	   / /|	    |\\ \\   ");
		System.out.println("	|	  |	| |	    | | |    ");
		System.out.println("	|	 | |  |	    |  | |   ");
		System.out.println("	|	 # 	  \\_ _ _/    #  ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	 /__]_[__\\       ");
		System.out.println("	|                        ");
		System.out.println("________|________________/__]_[__\\__________  ");
		
	}
	public void menu(){
		System.out.println("\t|+-------------+|");
		System.out.println("\t|+---Hangman---+|");
		System.out.println("\t|+-------------+|");
		while(true){
			System.out.println();
			System.out.println("+-----------------------+");
			System.out.println("|       Main Menu       |");
			System.out.println("+-----------------------+");
			System.out.println("| 1.To Play Hangman     |");
			System.out.println("| 2.How to Play Nim     |");
			System.out.println("| 3.Exit                |");
			System.out.println("+-----------------------+");
			while(true){
				try{
					System.out.print("Enter your choice(1-3):");
				    choice=sc.next();
					choiceInt=Integer.parseInt(choice);
					if(choiceInt==1){
						Hangman hm=new Hangman();
						hm.play();
						System.out.print("Press any key to goto menu:");
						String exit=sc.next();
						break;
					}else if(choiceInt==2){
						System.out.println();
						System.out.println("\t*Hangman is a word guessing game."); 
						System.out.println("\t*The computer provides a random word."); 
						System.out.println("\t*The other player guess it by suggesting letters within a certain number of guesses.");
						System.out.println();
						System.out.print("Press any key to goto menu:");
						String exit=sc.next();
						break;
					}else if(choiceInt==3){
						System.exit(0);
					}else{
						System.out.println("Please enter correct value(1-3)");
					}
			}catch(Exception e){
				System.out.println("Please enter correct integer value(1-3)");
			}
			}	
			
			



		}


	}
}

/*
	System.out.println("")			______________________
	System.out.println("")			|			 |			
									|		 	 |
									|		     |
									|		    /~\
									|	       |0 0|
									|	 	  _ \=/ _
									|	    /         \
									|	   / /|	    |\ \
									|	  |	| |	    | | |
									|	 | |  |	    |  | |
									|	 # 	  \_ _ _/    #
									|	 	  |  |  |
									|	 	  |  |  |
									|	 	  |  |  |
									|	 	  |  |  |
									|	 	 /__]_[__\ 
									|
								____|____

System.out.println("	______________________   ");
		System.out.println("	|			 |		     ");
		System.out.println("	|		     |           ");
		System.out.println("	|		     |           ");
		System.out.println("	|		    /~\\         ");
		System.out.println("	|	       |0 0|         ");
		System.out.println("	|	 	  _\\=/ _        ");
		System.out.println("	|	    /         \\     ");
		System.out.println("	|	   / /|	    |\\ \\   ");
		System.out.println("	|	  |	| |	    | | |    ");
		System.out.println("	|	 | |  |	    |  | |   ");
		System.out.println("	|	 # 	  \\_ _ _/    #  ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	  |  |  |        ");
		System.out.println("	|	 	 /__]_[__\\       ");
		System.out.println("	|                        ");
		System.out.println("____|____                    ");
*/



