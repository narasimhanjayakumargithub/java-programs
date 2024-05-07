package codevita;
import java.util.*;
public class Nondecrease {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
try{
long n=sc.nextLong();
if(n&gt;999999999)
{
System.out.println(&quot;28&quot;);
System.exit(0);
}
for( long i=n;i&gt;=0;i--)
{
long q,r,r1;
long d=i;
int flag=1;
//System.out.println(&quot;NUMBER : &quot;+d);
while(d!=0 &amp;&amp; flag==1)
{
r=d%10;
d=d/10;
r1=d%10;
// System.out.println(&quot;r &quot;+r+&quot;r1 &quot;+r1+&quot; d &quot;+d);
if(r&gt;=r1)
{
flag=1;
}
else
{
flag=0;
}
}
if(flag==1)

{
System.out.println(i);
break;
}
}
}
catch(Exception e)
{
System.out.println(28);
}
}

}