import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Day1P1
{
	int S;
	Day1P1()
	{
		S = 0;
	}

	void countFloor(char c)
	{
		if (c == '(')
			S++;
		else if (c == ')')
			S--;
	}
	public static void main(String args[])
	{
		Day1P1 obj = new Day1P1();	
		try
		{
			Scanner sc = new Scanner(new File("../inputs/input_day1.txt"));	
			while(sc.hasNextLine())
			{
				String abc = sc.nextLine();	
				for (int i = 0; i < abc.length(); i++)
					obj.countFloor(abc.charAt(i));
			}
			sc.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println(obj.S);

	}
}
