import java.util.Scanner;
class ShortLong 
{
static int len(String s)
{
int c=0;
try
{ 
for(;;)
{ 
s.charAt(c++); 
} 
}
catch(Exception e)
{ 
return c; 
}
}
static String[] split(String s)
{
int w=1,l=len(s);
for(int i=0;i<l;i++) 
if(s.charAt(i)==' ') 
w++;
String[] arr=new String[w];
int k=0,st=0;
for(int i=0;i<=l;i++)
{
if(i==l||s.charAt(i)==' ')
{
String word="";
for(int j=st;j<i;j++) 
word+=s.charAt(j);
arr[k++]=word;
st=i+1;
}
}
return arr;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String[] w=split(sc.nextLine());
String min=w[0],max=w[0];
for(int i=1;i<w.length;i++)
{
if(len(w[i])<len(min)) 
min=w[i];
if(len(w[i])>len(max)) 
max=w[i];
}
System.out.println("Shortest: "+min);
System.out.println("Longest: "+max);
}
}

