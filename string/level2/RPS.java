import java.util.Scanner;
class RPS 
{
static String computer()
{
int r=(int)(Math.random()*3);
return r==0?"rock":r==1?"paper":"scissors";
}
static int win(String u,String c)
{
if(u.equals(c)) 
{
return 0;
}
if((u.equals("rock")&&c.equals("scissors"))||(u.equals("paper")&&c.equals("rock"))||(u.equals("scissors")&&c.equals("paper"))) 
{
return 1;
}
return -1;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),pw=0,cw=0;
for(int i=0;i<n;i++)
{
String u=sc.next();
String c=computer();
int r=win(u,c);
if(r==1) 
pw++;
if(r==-1) 
cw++;
}
System.out.println("Player Wins: "+pw);
System.out.println("Computer Wins: "+cw);
}
}

