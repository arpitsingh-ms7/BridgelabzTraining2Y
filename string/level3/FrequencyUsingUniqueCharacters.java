import java.util.Scanner;
class FrequencyUsingUniqueCharacters
{
static char[] unique(String s)
{
char[] temp=new char[s.length()];
int k=0;
for(int i=0;i<s.length();i++)
{
boolean u=true;
for(int j=0;j<i;j++)
{
if(s.charAt(i)==s.charAt(j))
{
u=false;
break;
}
if(u)
temp[k++]=s.charAt(i);
}
}
char[] r=new char[k];
for(int i=0;i<k;i++)
{
r[i]=temp[i];
}
return r;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
char[] u=unique(s);
for(char c:u)
{
int count=0;
for(int i=0;i<s.length();i++)
if(c==s.charAt(i))
count++;
System.out.println(c+" = "+count);
}
}
}
