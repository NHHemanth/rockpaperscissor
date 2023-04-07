package rock_paper_scissor_game;
import java.util.*;
public class Rock_Paper_Scissor 
{

	public static void main(String[] args)
	{
		int i = 0;
		int count=0; 
		int Computercount=0;
		int tie=0;
		int tn=0;

		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Enter player Name: ");
		String name=scan.nextLine().toUpperCase();
		System.out.println();
		
		System.out.println("\t\t WELL COME TO THE GAMING WORLD "+name);
		
		
		do {
			
			String[] rps= {"r","p","s"};
			String ComputerMove=rps[new Random().nextInt(rps.length)];
			
			
			String PlayerMove;
			while(true)
			{	
				
				System.out.println("Please enter For rock(r) and for paper(p) and for Scissor(s)");	
				
				PlayerMove=scan.next().toLowerCase();
				
				
				
				
				if(PlayerMove.equals("r") || PlayerMove.equals("p") || PlayerMove.equals("s"))
				{
					break;
				}
				System.out.println("invalid input!please try another time");
			}
			
				System.out.println("Computer Moved:"+ ComputerMove);
				//tie
				
				if(PlayerMove.equals(ComputerMove))
				{
					System.out.println("Game is Tie! :)");
					tie++;
					tn++;
				}
				//paper
				else if(PlayerMove.equals("p"))
				{
					if(ComputerMove.equals("r"))
					{
						System.out.println("You win :)"+" "+name);
						count++;
						tn++;
						
					}
					else if(ComputerMove.equals("s"))
					{
						System.out.println("You Lose :(");
						 Computercount++;
						 tn++;
					}
				}
				
				//rock
				else if(PlayerMove.equals("r"))
				{
					if(ComputerMove.equals("s"))
					{
						System.out.println("You win :)");
						count++;
						tn++;
					}
					
					else if(ComputerMove.equals("p"))
					{
						System.out.println("You Lose :(");
						 Computercount++;
						 tn++;
					}	
				}

				//Scissor
				else if(PlayerMove.equals("s"))
				{
					if(ComputerMove.equals("p"))
					{
						System.out.println("You win :)");
						count++;
						tn++;
					}
					else if(ComputerMove.equals("r"))
					{
						System.out.println("You Lose :(");
						 Computercount++;
						 tn++;
					}
				}
				
				
				
				try
				{
					System.out.println("Please Enter 1 for play again ");
					
					i=scan.nextInt();
					if(i!=1)
					{
						System.out.println("\t\t::::GAME OVER:::: "+name);
					}
				}
				catch (Exception e)
				{
					System.out.println("invalid input please enter once again:");
				}
				
				scan.nextLine();
			
		}while(i==1);
		

		System.out.println();
		
		try
		{
			System.out.println("if want game report please enter 1(for yes)!For (NO) enter any Numaric digit");
			int b=scan.nextInt();
			if(b==1)
			{
			System.out.println("Total Number of time you played:"+tn);
			System.out.println("Number of time's you win the Game :"+count);
			System.out.println("Number of time's Computer win the Game :"+Computercount);
			System.out.println("Number of time's Game tie :"+tie);
			}	
		}
			
//		catch(ArithmeticException ae )
//		{
//			System.err.println("please enter correct values:");
//		}
		catch(Exception e)
		{
			System.err.println(" Sorry! you are out of game now");
		}

		
		
		
			
			
			
			
	}
			
		
		
		
		
}


	
