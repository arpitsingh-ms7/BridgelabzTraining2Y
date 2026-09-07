import java.util.Scanner;
class SplitCompare 
{
static int myLength(String s)
{
int c=0;
try
{ 
for(;;)
{ 
s.charAt(c++); 
} 
}
catch(Exception e){ 
return c; 
}
}
static String[] mySplit(String s)
{
int len=myLength(s),words=1;
for(int i=0;i<len;i++) 
if(s.charAt(i)==' ') 
words++;
String[] arr=new String[words];
int index=0,start=0;
for(int i=0;i<=len;i++)
{
if(i==len||s.charAt(i)==' ')
{
String word="";
for(int j=start;j<i;j++) 
word+=s.charAt(j);
arr[index++]=word;
start=i+1;
}
}
return arr;
}
static boolean compare(String[] a,String[] b)
{
if(a.length!=b.length) 
return false;
for(int i=0;i<a.length;i++)
if(!a[i].equals(b[i])) 
return false;
return true;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String text=sc.nextLine();
String[] a=mySplit(text);
String[] b=text.split(" ");
System.out.println("Same? "+compare(a,b));
}
}

