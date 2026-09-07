import java.util.Scanner;
class StringLength 
{
static int myLength(String s)
{
int count=0;
try{
for(;;)
{
s.charAt(count);
count++;
}
}catch(Exception e){
return count;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string :");
String s=sc.next();
System.out.println("User Method Length: "+myLength(s));
System.out.println("Built-in Length: "+s.length());
}
}

