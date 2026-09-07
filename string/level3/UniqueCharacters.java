import java.util.Scanner;
class UniqueCharacters
{
static int findLength(String s)
{
int c=0;
try
{
while(true)
{
s.charAt(c);
c++;
}
}
catch(Exception e)
{
}
return c;
}
static char[] uniqueChars(String s)
{
int n=findLength(s);
char[] temp=new char[n];
int k=0;
for(int i=0;i<n;i++)
{
boolean unique=true;
for(int j=0;j<i;j++)
{
if(s.charAt(i)==s.charAt(j))
{
unique=false;
break;
}
}
if(unique)
temp[k++]=s.charAt(i);
}
char[] result=new char[k];
for(int i=0;i<k;i++)
result[i]=temp[i];
return result;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
char[] u=uniqueChars(s);
for(char c:u)
{
System.out.print(c+" ");
}
}
}