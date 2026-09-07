import java.util.Scanner;
class CharFrequency
{
static String[][] frequency(String s)
{
int[] freq=new int[256];
for(int i=0;i<s.length();i++)
{
freq[s.charAt(i)]++;
}
int count=0;
for(int i=0;i<256;i++)
{
if(freq[i]>0)
count++;
}
String[][] res=new String[count][2];
int k=0;
for(int i=0;i<256;i++)
{
if(freq[i]>0)
{
res[k][0]=String.valueOf((char)i);
res[k][1]=String.valueOf(freq[i]);
k++;
}
}
return res;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String[][] r=frequency(s);
for(int i=0;i<r.length;i++)
{
System.out.println(r[i][0]+" = "+r[i][1]);
}
}
}

