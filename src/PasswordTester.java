//Justin Himmighoefer
//This programs checks a users password to see if it meets certain requirements
//It also reports back if the password is week by checking to see what special
//characters have been used, capital letters, numbers and length checking.

import java.util.*;

public class PasswordTester
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		boolean minChar=false, upperCase=false, lowerCase=false, digit=false, specialChar=false;
		int count = 0;
		
		System.out.println("Please enter a password: ");
		userInput = keyboard.nextLine();
		
		if(userInput.length() >= 8)
		{
			minChar = true;
		}//end if test for 8 chars
		
		else
		{
			System.out.println("Minimum length not met, exit.");
			System.exit(0);
		}//end else if conditions not met
		
		for(int i = 0; i < userInput.length(); ++i)
		{
			if(Character.isUpperCase(userInput.charAt(i)))
					{
						upperCase = true;
						count++;
						break;
					}//end if
		}//end for loop checking upper case chars
		
		for(int i = 0; i < userInput.length(); ++i)
		{
			if(Character.isLowerCase(userInput.charAt(i)))
					{
						lowerCase = true;
						count++;
						break;
					}//end if
		}//end for loop checking lower case chars
		
		for(int i = 0; i < userInput.length(); ++i)
		{
			if(Character.isDigit(userInput.charAt(i)))
					{
						digit = true;
						count++;
						break;
					}//end if
		}//end for loop checking digit chars
		
		for(int i = 0; i < userInput.length(); ++i)
		{
			switch(userInput.charAt(i))
			{
			case '*':
			case '!':
			case '#':
			case '_':
				specialChar = true;
				count++;
				break;
			}//end switch checking for special chars
			if(specialChar = true)
			{
				break;
			}//end if breaking out of for loop
		}//end for loop checking upper case chars
	if(count >= 3)
	{
		System.out.println("Congratulations, you set a strong like bull password!");
	}//end if checking if 3/4 requirements are met
	
	else
	{
		System.out.println("Your password is weak like little girl!");
	}//end else
	}//end main
}//end class
