import java.util.Scanner;
class DeckOfCards
{
static String[] initializeDeck()
{
String[] suits={"Hearts","Diamonds","Clubs","Spades"};
String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
int n=suits.length*ranks.length;
String[] deck=new String[n];
int k=0;
for(int i=0;i<suits.length;i++)
{
for(int j=0;j<ranks.length;j++)
{
deck[k++]=ranks[j]+" of "+suits[i];
}
}
return deck;
}
static void shuffle(String[] deck)
{
int n=deck.length;
for(int i=0;i<n;i++)
{
int r=i+(int)(Math.random()*(n-i));
String temp=deck[i];
deck[i]=deck[r];
deck[r]=temp;
}
}
static String[][] distribute(String[] deck,int players,int cards)
{
if(players*cards>deck.length)
return null;
String[][] p=new String[players][cards];
int k=0;
for(int i=0;i<players;i++)
{
for(int j=0;j<cards;j++)
{
p[i][j]=deck[k++];
}
}
return p;
}
static void printPlayers(String[][] p)
{
for(int i=0;i<p.length;i++)
{
System.out.println("Player "+(i+1)+":");
for(int j=0;j<p[i].length;j++)
{
System.out.println(p[i][j]);
System.out.println();
}     
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int players=sc.nextInt();
int cards=sc.nextInt();
String[] deck=initializeDeck();
shuffle(deck);
String[][] p=distribute(deck,players,cards);
if(p==null)
{
System.out.println("Not possible to distribute");
}
else 
{
printPlayers(p);
}
}
}