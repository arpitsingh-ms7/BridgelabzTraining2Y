import java.util.Scanner;
class CharType 
{
static String check(char ch)
{
if(ch>='A'&&ch<='Z') 
ch=(char)(ch+32);
if(ch>='a'&&ch<='z')
{
if("aeiou".indexOf(ch)>=0) 
return "Vowel";
return "Consonant";
}
return "Not a Letter";
}
static String[][] process(String s)
{
String[][] arr=new String[s.length()][2];
for(int i=0;i<s.length();i++)
{
arr[i][0]=String.valueOf(s.charAt(i));
arr[i][1]=check(s.charAt(i));
}
return arr;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String[][] a=process(sc.nextLine());
System.out.println("CHAR\tTYPE");
for(int i=0;i<a.length;i++)
System.out.println(a[i][0]+"\t"+a[i][1]);
}
}


