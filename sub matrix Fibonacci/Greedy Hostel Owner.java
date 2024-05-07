package codevita;
import java.util.*;
public class Greedy {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
String w[]=new String[n];
for(int i=0;i&lt;n;i++)
{
w[i]=sc.next();
}
int ans,sum=0;
int dif=sc.nextInt();
String ap=&quot;ABCDEFGHIJ&quot;;
for(int k=0;k&lt;n;k++)
{
String res=&quot;&quot;;
String s=w[k];
char ch[]=s.toCharArray();
for(int ii=0;ii&lt;ch.length;ii++)
{
if(ch[ii]==&#39;J&#39; &amp;&amp; ii!=(ch.length)-1)
{
if(ch[ii+1]==&#39;A&#39;)
{
res+=&quot;0&quot;;
}
else
{
res+=&quot;9&quot;;
}
}
else if(ch[ii]==&#39;I&#39; &amp;&amp; ii!=(ch.length)-1)
{
if(ch[ii+1]==&#39;B&#39;)
{
res+=&quot;1&quot;;
}
else
{
res+=&quot;8&quot;;

}
}
else if(ch[ii]==&#39;H&#39; &amp;&amp; ii!=(ch.length)-1)
{
if(ch[ii+1]==&#39;C&#39;)
{
res+=&quot;2&quot;;
}
else
{
res+=&quot;7&quot;;
}
}
else if(ch[ii]==&#39;G&#39; &amp;&amp; ii!=(ch.length)-1)
{
if(ch[ii+1]==&#39;D&#39;)
{
res+=&quot;3&quot;;
}
else
{
res+=&quot;6&quot;;
}
}
else if(ch[ii]==&#39;F&#39; &amp;&amp; ii!=(ch.length)-1)
{
if(ch[ii+1]==&#39;E&#39;)
{
res+=&quot;4&quot;;
}
else
{
res+=&quot;5&quot;;
}
}
else
{
char chh=ch[ii];
int e=ap.indexOf(chh);
res+=e;
}
//System.out.println(res);
}
ans=Integer.parseInt(res);
sum+=ans;
ans=0;

}

if(dif&lt;sum)
{
System.out.println(&quot;GREEDY&quot;);
System.out.println(sum-dif);
}
else
{
System.out.println(&quot;INNOCENT&quot;);
}
}
}

