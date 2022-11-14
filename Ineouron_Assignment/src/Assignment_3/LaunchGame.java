package Assignment_3;
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		System.out.println(":: Welcome to Guesser Game ::");
		
		System.out.println("Guesser kindly guess the number between 1 to 10 ");
		Scanner sc=new Scanner(System.in);
		while(true) {
			guessNum=sc.nextInt();
			if (guessNum<=10) break;
			System.out.println("Plese enter in range ");
			
		}
		System.out.println("Number accepted ");
		return guessNum;
	}	
}

class Player
{
	static int count=1;
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number between 1 to 10 for Player:"+ count);
		guessNum=scan.nextInt();
		while(guessNum>10) {
			System.out.println("Plese enter in range ");
			guessNum=scan.nextInt();
		}
		count++;
		System.out.println("Number accepted ");
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();

	}

}
