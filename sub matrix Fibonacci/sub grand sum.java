package codevita;
import java.util.*;
public class Multiple {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=&quot;&quot;;
long fib=0;
int row=sc.nextInt();
int col=sc.nextInt();
int sub=sc.nextInt();
int a[][]=new int[row][col];
for(int i=0;i&lt;row;i++)
{
for(int j=0;j&lt;col;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int g=0;g&lt;sub;g++)
{
int p=sc.nextInt();
int q=sc.nextInt();
int r=sc.nextInt();
int s=sc.nextInt();
long sum=0;
for(int i=p;i&lt;=r;i++)
{
for(int j=q;j&lt;=s;j++)
{
//System.out.println(a[i][j]+&quot; &quot;);
sum+=a[i][j];
}
//System.out.println();
}
//System.out.println(sum);
long md=sum%50;
//System.out.println(&quot;mod&quot;+md);
fib=fibonaci(md);
System.out.println(fib);
//str+=fib+&quot; &quot;;
}
//String w[]=str.split(&quot; &quot;);
//for(int h=0;h&lt;w.length;h++)
//System.out.println(w[h]);
}
public static long fibonaci(long x)
{
//System.out.println(&quot;XX&quot;+x);
long a=0,b=1,c=0,t;
if(x==1)
{
t=1;
}
else if(x==2)
{

t=1;
}
else
{
//System.out.println(&quot;SS&quot;);
for(int i=2;i&lt;=x;i++)
{
c=a+b;
//System.out.println(c+&quot; &quot;);
a=b;
b=c;
}
t=c;
}
return t;
}
}

