package codevita;

import java.util.*;

public class concateprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<70)
		{	
			int count=0;
			int count2=0;
			int primecount=0;
			String prime="";
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					
					prime+=i+" ";
				}
				count=0;
			}
			System.out.println(prime);
			
			String strarr[]=prime.split(" ");
			TreeSet<Integer> st=new TreeSet<Integer>();
			for(int i=0;i<strarr.length;i++)
			{
				for(int j=0;j<strarr.length;j++)
				{
					String s=strarr[i]+strarr[j];
					int num=Integer.parseInt(s);
					for(int k=1;k<=num;k++)
					{
						if(num%k==0)
						{
							count2++;
						}
					}
					if(count2==2)
					{
						System.out.print(num+"   ");
						st.add(num);
						primecount++;
					}
					
					count2=0;
					
				}
				System.out.println();
			}
			System.out.println(primecount);
			System.out.println("answer "+st.size());
		}
	}

}
