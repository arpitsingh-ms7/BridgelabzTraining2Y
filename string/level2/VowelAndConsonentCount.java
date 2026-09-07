import java.util.Scanner;
class VowelAndConsonentCount 
{
static int type(char ch)
{
if(ch>='A'&&ch<='Z') 
ch=(char)(ch+32);
if(ch>='a'&&ch<='z')
{
if("aeiou".indexOf(ch)>=0) 
return 1;
return 2;
}
return 0;
}
static int[] count(String s)
{
int v=0,c=0;
for(int i=0;i<s.length();i++)
{
int t=type(s.charAt(i));
if(t==1) 
v++;
if(t==2) 
c++;
}
return new int[]{v,c};
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] r=count(sc.nextLine());
System.out.println("Vowels: "+r[0]);
System.out.println("Consonants: "+r[1]);
    }
}


