package prp;

import java.util.*;

public class Stable_num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(stab(input));
		
	}
	
	public static String stab(String input)
	{
		int lenght = input.replace(input.charAt(0)+"" , "").length();
		for(int i=1;i<input.length();i++)
		{
			if(lenght != input.replace(input.charAt(i)+"","").length())
			{
				return "Unstable";
			}
		}
		return "stable";
			
	}

}
