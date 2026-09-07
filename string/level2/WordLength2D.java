import java.util.Scanner;
class WordLength2D 
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
catch(Exception e)
{ 
return c; 
}
}
static String[] split(String s)
{
int len=myLength(s),w=1;
for(int i=0;i<len;i++) 
if(s.charAt(i)==' ') 
w++;
String[] arr=new String[w];
int k=0,st=0;
for(int i=0;i<=len;i++)
{
if(i==len||s.charAt(i)==' ')
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
static String[][] to2D(String[] words)
{
String[][] arr=new String[words.length][2];
for(int i=0;i<words.length;i++)
{
arr[i][0]=words[i];
arr[i][1]=String.valueOf(myLength(words[i]));
}
return arr;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string :");
String text=sc.nextLine();
String[][] data=to2D(split(text));
System.out.println("WORD\tLENGTH");
for(int i=0;i<data.length;i++)
System.out.println(data[i][0]+"\t"+Integer.parseInt(data[i][1]));
}
}

