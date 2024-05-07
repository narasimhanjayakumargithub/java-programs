package palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pal {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	ArrayList<String>a1=new ArrayList<String>();
	int n=2;
	while(n<=s.length())
	{
		for(int i=0;i<=s.length()&&i+n<=s.length();i++)
		{
			if(s.substring(i,i+n).equals(new StringBuffer(s.substring(i,i+n)).reverse().toString()))
			{
				a1.add(s.substring(i,i+n));
			}
		}n++;
	}
	String max=Collections.max(a1);
	for(String pali:a1)
	{
		if(pali.length()==max.length())
	  System.out.println(pali);
	}
}}


