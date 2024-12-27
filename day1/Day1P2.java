import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Day1P2
{
	int S;
	Day1P2()
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
	boolean detectBasement()
	{
		return S == -1;
	}
	public static void main(String args[])
	{
		Day1P2 obj = new Day1P2();	
		try
		{
			Scanner sc = new Scanner(new File("../inputs/input_day1.txt"));	
			int k = 0;
			while(sc.hasNextLine())
			{
				String abc = sc.nextLine();	
				for (int i = 0; i < abc.length(); i++)
				{
					obj.countFloor(abc.charAt(i));
					if (obj.detectBasement())
					{
						System.out.println(k+1);
						System.exit(0);
					}
					k++;
				}
			}
			sc.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.exit(0);
		}

	}
}
