import java.util.Scanner;

public class funWithLoops {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int entry;
		Boolean cont = true, confirm = false;
		String choice = "";
		String entryP2 = "";
		String oddOrEven = "Even";
		String jargon = "";
		String name = " ";
		
		System.out.println("Hello there human, what is your name? ");
		name = "the human called " + userInput.nextLine();
		do
		{
		do
		{
		
		System.out.print("Okay then, " + name + ", please enter a number from 1 and 100: ");
		entry = userInput.nextInt();
		} while (entry>100 || entry < 1);
		
		
		if(entry % 2 == 1)
			
		{
			oddOrEven = "Odd";
			entryP2 = Integer.toString(entry) + " ";
		}	
		
		if(entry >= 60)
		{
			entryP2 =Integer.toString(entry) + " ";
			if(entry % 2 == 1)
			{
				jargon = " and over 60.";
			}
		}
		
		if(entry % 2 == 0 && entry < 25)
			{
				jargon = " and less than 25.";
			}
		
		System.out.println(entryP2 + oddOrEven + jargon);
		userInput.nextLine();
		
		do	{
		System.out.println("Are you satisfied, " + name + "(y/n)");
		choice = userInput.nextLine();
		
		if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n"))
		confirm = true;
		else 
			confirm = false;
		
		}while (confirm == false);
		
		if(choice.equalsIgnoreCase("y"))
			cont = false;
		
		}while (cont);
		
		System.out.println("Goodbye!");
		userInput.close();
	}

}
