package mypro;

import java.util.*;

public class rajivroy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
		String pin=sc.next();
		int n=sc.nextInt();
		String sname="";
		String lname="";
		if(s1.length()>s2.length())
		{
			lname=s1;
			sname=s2;
		}
		else if(s1.length()<s2.length())
		{
			lname=s2;
			sname=s1;
		}
		else if(s1.length()==s2.length())
		{
			String tmp1=s1.toLowerCase();
			String tmp2=s2.toLowerCase();
			for(int i=0;i<tmp1.length();i++)
			{
				if(tmp1.charAt(i)!=tmp2.charAt(i) && tmp1.charAt(i)<tmp2.charAt(i))
				{
					sname=s1;
					lname=s2;
					break;
				}
				else if(tmp1.charAt(i)!=tmp2.charAt(i) && tmp1.charAt(i)>tmp2.charAt(i))
				{
					lname=s1;
					sname=s2;
					break;
				}
			}
		}
		
		System.out.println(lname.charAt(0)+sname+pin.charAt(n-1)+pin.charAt(pin.length()-n));
	}

}
